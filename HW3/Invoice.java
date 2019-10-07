import java.util.*;
import javax.swing.event.*;

public class Invoice{

   public Invoice(){
      items = new ArrayList<>();
      listeners = new ArrayList<>();
   }

   public void addItem(LineItem item){
	  item.increaseOrder();
	  if(!items.contains(item)){
		  items.add(item);
	  }
      ChangeEvent event = new ChangeEvent(this);
      for (ChangeListener listener : listeners)
         listener.stateChanged(event);
   }

   public void addChangeListener(ChangeListener listener){
      listeners.add(listener);
   }

   public Iterator<LineItem> getItems(){
      return new
         Iterator<LineItem>()
         {
            public boolean hasNext(){
               return current < items.size();
            }

            public LineItem next(){
               return items.get(current++);
            }

            public void remove(){
               throw new UnsupportedOperationException();
            }

            private int current = 0;
         };
   }

   public String format(InvoiceFormatter formatter){
      String r = formatter.formatHeader();
      Iterator<LineItem> iter = getItems();
      while (iter.hasNext())
         r += formatter.formatLineItem(iter.next());
      return r + formatter.formatFooter();
   }

   private ArrayList<LineItem> items;
   private ArrayList<ChangeListener> listeners;
}

import java.util.*;

public class Bundle implements LineItem{
	
   public Bundle() {
	   items = new ArrayList<>();
   }

   public void add(LineItem item) {
	   items.add(item);
   }

   public double getPrice(){
      double price = 0;
      for (LineItem item : items)
         price += item.getPrice();
      return price;
   }

   public String toString(){
      String description = "Bundle: ";
      for (int i = 0; i < items.size(); i++){
         if (i > 0) description += ", ";
         description += items.get(i).toString();
      }
      return description;
   }
   
   public int timesOrdered() {
	   return orders;
   }
   
   public int increaseOrder() {
	   return orders ++;
   }

   private ArrayList<LineItem> items;
   private int orders = 0;
}

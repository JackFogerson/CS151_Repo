public class SimpleFormatter implements InvoiceFormatter{
   
	public String formatHeader(){
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item){
      total += item.getPrice()*item.timesOrdered();
      return (item.toString() + ": (" + item.timesOrdered() + " orders) @" + item.getPrice() + " each \n");
   }

   public String formatFooter(){
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}

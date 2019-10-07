public class DiscountedItem implements LineItem{
   
   public DiscountedItem(LineItem item, double discount){ 
      this.item = item; 
      this.discount = discount;
   }

   public double getPrice() {
      return item.getPrice() * (1 - discount / 100); 
   }

   public String toString(){
      return item.toString() + " (Discount " + discount + "%)";
   } 
   
   public int timesOrdered() {
      return orders; 
   }
   
   public int increaseOrder() {
	   return orders ++;
   }

   private LineItem item;
   private double discount;
   private int orders = 0;
}

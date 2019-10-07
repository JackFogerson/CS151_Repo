public class Product implements LineItem{

   public Product(String description, double price, int orders){
      this.description = description;
      this.price = price;
      this.orders = orders;
   }
   
   public double getPrice() { return price; }
   public String toString() { return description; }
   public int timesOrdered() { return orders;}
   public int increaseOrder() {return orders ++;}
   private String description;
   private double price;
   public int orders;
}

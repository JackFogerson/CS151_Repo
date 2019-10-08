public class HTMLPage implements InvoiceFormatter{
	public String formatHeader(){
		total = 0;
	     String HTML = "<span style='font-family:\"Times New Roman\"'><h2>I N V O I C E</h2></span><br/>";
	      return HTML;
		}

	public String formatLineItem(LineItem item){
	      total += item.getPrice()*item.timesOrdered();
	      return (item.toString() + ": (" + item.timesOrdered() + " orders) @" + item.getPrice() + " each" + "<br></br>");
	}
	
	public String formatFooter(){
		String HTML3 = "<span style='font-family:\"Times New Roman\"'><h1><font color=\"red\">TOTAL DUE: </font></h1></span><h3>" + total + "</h3>";
	      return HTML3;
	}
	
	private double total;
}

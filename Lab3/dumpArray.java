import java.awt.Rectangle;

public class dumpArray {
	
	   public static void main(String[] args){
		   Object[] objectArray = {"text", 8, new Rectangle(50, 80)};
		   DumpArray(objectArray);
	   }
	   
	   public static void DumpArray(Object[] o) {
		   for(int i=0;i<o.length;i++) {
	            System.out.println(o[i].toString());
		   }
	   }
}

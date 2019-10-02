import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;



public class DotIcon implements Icon{
	private int size;
	private Color color;
	
	public DotIcon(int aSize, Color c){
		size = aSize;
		color = c;
	}
	   
	public int getIconWidth(){
		return size;
	}

	public int getIconHeight(){
		return size;
	}

	public void paintIcon(Component c, Graphics g, int x, int y){
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double dot = new Ellipse2D.Double(x, y,size, size);
		g2.setColor(color);
		g2.fill(dot);
	}
	
	
}

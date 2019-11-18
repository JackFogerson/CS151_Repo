import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
	
  	public synchronized static Runnable move(MoveableShape ms, JLabel jl, int speed) {
	   return () ->
	      {
	         for (int i = 0; i < 50; i++) {
	            ms.move(speed);
	            jl.repaint();
	         }
	      };
}
	
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);
      
      final MoveableShape shape2
      = new CarShape(0, 150, CAR_WIDTH);
      
      final MoveableShape shape3
      = new CarShape(0, 260, CAR_WIDTH);

      ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon icon2 = new ShapeIcon(shape2,
              ICON_WIDTH, ICON_HEIGHT);
      
      ShapeIcon icon3 = new ShapeIcon(shape3,
              ICON_WIDTH, ICON_HEIGHT);

      final JLabel label = new JLabel(icon);
      final JLabel label2 = new JLabel(icon2);
      final JLabel label3 = new JLabel(icon3);
      frame.setLayout(new FlowLayout());
      frame.add(label);
      frame.add(label2);
      frame.add(label3);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      



      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, event ->
         {
     		ExecutorService service = Executors.newCachedThreadPool();
    		Runnable m1 = move(shape,label,2);
    		Runnable m2 = move(shape2,label2,3);
    		Runnable m3 = move(shape3,label3,1);
    		service.execute(m1);
    		service.execute(m2);
    		service.execute(m3);
    		service.shutdown();
         });
      t.start();
   }

   private static final int ICON_WIDTH = 600;
   private static final int ICON_HEIGHT = 800;
   private static final int CAR_WIDTH = 60;
}

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      JButton inButton = new JButton("Zoom in");
      JButton outButton = new JButton("Zoom out");
 


      final MoveableShape shape
            = new CarShape(0, 0, CAR_WIDTH);

      final ShapeIcon icon = new ShapeIcon(shape,
            ICON_WIDTH, ICON_HEIGHT);

      //inButton.addActionListener(event -> icon.rePaint());
      
      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(inButton);
      frame.add(outButton);
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
   

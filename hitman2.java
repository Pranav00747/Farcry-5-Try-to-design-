import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;

class hitman2 extends JPanel
{
public hitman2()
{
}
@override
public void paintComponent(Graphics g)
{
  Graphics2D g2 = (Graphics2D)g;
}
}

public class hitman2
{
   public static void main(String args[]) throws Exception
   {
        hitman2 ht2 = new hitman2();
         ht2.setUndecorated(true); // remove title bar use setoverdirect in python
         ht2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ht2.setVisible(true);
   }
}

    

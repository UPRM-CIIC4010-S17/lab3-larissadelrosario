import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g); //window display
 
                        
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets(); //borders of the graph
                        int x1 = myInsets.left;
                        System.out.println(x1);
     
                        int y1 = myInsets.top;
                        System.out.println(y1);
                   
                        int x2 = getWidth() - myInsets.right - 1;
                        System.out.println(x2);
                      int y2 = getHeight() - myInsets.bottom - 1;
                      System.out.println(y2);
                       int width = x2 - x1;
                       int height = y2 - y1;
                       
                       int x3 = (x2/2)  - (55/2);
                       System.out.println(x3);
                       int y3 = (y2/2)  - (55/2);
                       System.out.println(y3);
 
//                        //Paint the background
//                        g.setColor(Color.MAGENTA);
//                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1, y1, width, height);
//                        //Second Border
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1 +20, y1+20, width-40, height-40);
//                        g.setColor(Color.GRAY);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.GRAY);
//                        g.drawLine(x1+width, y1, x2-width, y2);
                        
//                        
                       g.setColor(Color.RED);
                       g.fillOval(x3, y3, 55, 55);
//                        
                        
            }
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
        //BANDERA DE PUERTO RICO
                       
                       //Franjas
                       g.setColor(Color.RED);
                       g.fillRect(x1,y1, 210, 20);
                       g.setColor(Color.WHITE);
                       g.fillRect(x1,20, 210, 20);
                       g.setColor(Color.RED);
                       g.fillRect(x1,40, 210, 20);
                       g.setColor(Color.WHITE);
                       g.fillRect(x1,60, 210, 20);
                       g.setColor(Color.RED);
                       g.fillRect(x1,80, 210, 20);
                       
                       //Triangulo 
                       
                       Polygon p = new Polygon();
                     p.addPoint(x1, y1);
                     p.addPoint(x1,100);
                     p.addPoint(105,50);
                   g.setColor(Color.BLUE);
                   g.fillPolygon(p);
                   
                   
                   //Estrella
                   
                 Polygon p2 = new Polygon();
                 p2.addPoint(x1 + 15, y1 + 43);
                 p2.addPoint(x1 + 31, y1 + 43);
                 p2.addPoint(x1 + 37, y1 + 28);
                 p2.addPoint(x1 + 43, y1 + 43);
                 p2.addPoint(x1 + 59, y1 + 43);
                 p2.addPoint(x1 + 46, y1 + 53);
                 p2.addPoint(x1 + 51, y1 + 68);
                 p2.addPoint(x1 + 37, y1 + 58);
                 p2.addPoint(x1 + 24, y1 + 68);
                 p2.addPoint(x1 + 28, y1 + 53);
                 g.setColor(Color.WHITE);
                 g.fillPolygon(p2);
 
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
                        
//                       g.setColor(Color.RED);
//                       g.drawOval(x3, y3, 55, 55);
                       
                       
                      
                       
//                       Polygon p = new Polygon();
//                       p.addPoint(x1 + 5, y1 + 25);
//                       p.addPoint(x1 + 20, y1 + 10);
//                       p.addPoint(x1 + 35, y1 + 25);
//                       p.addPoint(x1 + 25, y1 + 25);
//                       p.addPoint(x1 + 25, y1 + 45);
//                       p.addPoint(x1 + 15, y1 + 45);
//                       p.addPoint(x1 + 15, y1 + 25);
//                       g.setColor(Color.BLUE);
//                       g.fillPolygon(p);
////                        
//                       Polygon p2 = new Polygon();
//                       p2.addPoint(x1 + 25, y1 + 73);
//                       p2.addPoint(x1 + 41, y1 + 73);
//                       p2.addPoint(x1 + 47, y1 + 58);
//                       p2.addPoint(x1 + 53, y1 + 73);
//                       p2.addPoint(x1 + 69, y1 + 73);
//                       p2.addPoint(x1 + 56, y1 + 83);
//                       p2.addPoint(x1 + 61, y1 + 98);
//                       p2.addPoint(x1 + 47, y1 + 88);
//                       p2.addPoint(x1 + 34, y1 + 98);
//                       p2.addPoint(x1 + 38, y1 + 83);
//                       g.setColor(Color.MAGENTA);
//                       g.drawPolygon(p2);
                       
               
                   
                        
            }
}

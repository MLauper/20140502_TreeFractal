import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;


@SuppressWarnings("serial")
public class Tree extends JComponent {

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
	
		drawTree(g2, this.getWidth()/2, this.getHeight(), 100, 90);
		
	}
	
	public void drawTree(Graphics2D g2,double x0, double y0, double len, double angle) {
        if(len > 2) {
            double x1 = x0 + len * Math.cos(Math.toRadians(angle)); 
            double y1 = y0 - len * Math.sin(Math.toRadians(angle)); 

            Point2D.Double p1 = new Point2D.Double(x0,y0);
            Point2D.Double p2 = new Point2D.Double(x1,y1);
            Line2D.Double l = new Line2D.Double(p1,p2);
            g2.setColor(Color.GREEN);
            g2.draw(l);
            drawTree(g2, x1, y1, len * 0.75, angle + 30);
            drawTree(g2, x1, y1, len * 0.66, angle - 50);
        }
    }	
	
	
	
}

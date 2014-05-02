import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Carpet extends JComponent {

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
	
		//drawCarpet(g2, this.getWidth()/2, this.getHeight(), 100, 90);
        g2.setColor(Color.PINK);
        g2.fill(new Rectangle(this.getWidth(),this.getWidth()));
        drawCarpet(g2, 0, 0, this.getWidth());
	}
	
	public void drawCarpet(Graphics2D g2,double x0, double y0, double width) {
        if(width > 3) {
//            double x1 = x0 + width * Math.cos(Math.toRadians(angle));
//            double y1 = y0 - width * Math.sin(Math.toRadians(angle));
            g2.setColor(Color.BLUE);
            g2.fillRect(
                        ((Double)x0).intValue() + ((Double)width).intValue()/3,
                        ((Double)y0).intValue() + ((Double)width).intValue()/3,
                        ((Double)width).intValue()/3,
                        ((Double)width).intValue()/3
            );

            //FirstRow
            drawCarpet(g2, ((Double)x0).intValue() + 0, ((Double)y0).intValue() + 0, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + 0, ((Double)y0).intValue() + ((Double)width).intValue()/3, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + 0, ((Double)y0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)width).intValue()/3);

            //Second Row
            drawCarpet(g2, ((Double)x0).intValue() + ((Double)width).intValue()/3, ((Double)y0).intValue() + 0, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + ((Double)width).intValue()/3, ((Double)y0).intValue() + ((Double)width).intValue()/3, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + ((Double)width).intValue()/3, ((Double)y0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)width).intValue()/3);

            //ThirdRow
            drawCarpet(g2, ((Double)x0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)y0).intValue() + 0, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)y0).intValue() + ((Double)width).intValue()/3, ((Double)width).intValue()/3);
            drawCarpet(g2, ((Double)x0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)y0).intValue() + 2 * ((Double)width).intValue()/3, ((Double)width).intValue()/3);

//
//            Point2D.Double p1 = new Point2D.Double(x0,y0);
//            Point2D.Double p2 = new Point2D.Double(x1,y1);
//            Line2D.Double l = new Line2D.Double(p1,p2);
//            g2.setColor(Color.GREEN);
//            g2.draw(l);
//            drawCarpet(g2, x1, y1, width * 0.75, angle + 30);
//            drawCarpet(g2, x1, y1, width * 0.66, angle - 50);
        }
    }	
	
	
	
}

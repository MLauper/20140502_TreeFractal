import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Triangle extends JComponent {

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;



        drawTriangle(g2, 0, this.HEIGHT, this.getWidth());
	}
	
	public void drawTriangle(Graphics2D g2,double x0, double y0, double width) {
        if(width < 10) {
            g2.setColor(Color.BLUE);

            int[] x = new int[3];
            int[] y = new int[3];

            x[0]=((Double)x0).intValue();
            y[0]=((Double)y0).intValue();

            x[1]=((Double)x0).intValue()+((Double)width).intValue();
            y[1]=((Double)y0).intValue();

            x[2]=((Double)x0).intValue()+((Double)width).intValue()/2;
            y[2]=((Double)y0).intValue()+((Double)width).intValue();

           Polygon p = new Polygon(x, y, 3);

            g2.fillPolygon(p);


        }
        else {
            drawTriangle(g2, x0,y0, width/2);
            drawTriangle(g2, x0 + width/2,y0, width/2);
            drawTriangle(g2, x0 + width/4,y0+width/2, width/2);
        }
    }	
	
	
	
}

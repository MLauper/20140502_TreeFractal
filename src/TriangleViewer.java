import javax.swing.*;

public class TriangleViewer {

	/**
	 * @param args unused
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setSize(600, 600);
		frame.setTitle("Fractal Carpet");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add component	
        Triangle component = new Triangle();
		frame.add(component);
		
		frame.setVisible(true);
		
	}
}

import javax.swing.*;

public class CarpetViewer {

	/**
	 * @param args unused
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setSize(600, 600);
		frame.setTitle("Fractal Carpet");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add component	
		Carpet component = new Carpet();
		frame.add(component);
		
		frame.setVisible(true);
		
	}
}

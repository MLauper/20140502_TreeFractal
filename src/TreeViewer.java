import javax.swing.JFrame;

public class TreeViewer {

	/**
	 * @param args unused
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setSize(600, 400);
		frame.setTitle("Fractal Tree");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add component	
		Tree component = new Tree();
		frame.add(component);
		
		frame.setVisible(true);
		
	}
}

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseTriangleViewer
{
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
	private static int buttonAClickCount = 0;
	private static int buttonBClickCount = 0;

	public static void main(String[] args)
	{
		JFrame frame = new MouseTriangleFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
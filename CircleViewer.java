import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class CircleViewer
{

	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args)
	{
		JFrame frame = new CircleFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
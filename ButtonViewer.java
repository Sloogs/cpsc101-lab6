import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonViewer
{
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 60;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me!");
		frame.add(button);

		button.addActionListener(
			(ActionEvent ae) -> {
				System.out.println("I was clicked");
			}
		);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
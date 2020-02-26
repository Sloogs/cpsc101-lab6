import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonViewer
{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static int buttonAClickCount = 0;
	private static int buttonBClickCount = 0;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton buttonA = new JButton("Button A");
		JButton buttonB = new JButton("Button B");
		panel.add(buttonA);
		panel.add(buttonB);
		panel.setLocation(100,100);
		frame.add(panel);

		buttonA.addActionListener(
			(ActionEvent ae) -> {
				buttonAClickCount++;
				System.out.println("Button A was clicked " + buttonAClickCount + " times!");
			}
		);

		buttonB.addActionListener(
			(ActionEvent ae) -> {
				buttonBClickCount++;
				System.out.println("Button B was clicked " + buttonBClickCount + " times!");
			}
		);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
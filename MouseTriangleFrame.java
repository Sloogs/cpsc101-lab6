import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class MouseTriangleFrame extends JFrame
{
	private MouseTriangleComponent scene;

	class MousePressListener implements MouseListener
	{
		public void mousePressed(MouseEvent m)
		{
			System.out.println("The mouse was clicked");
		}

		public void mouseReleased(MouseEvent m) {}
		public void mouseClicked(MouseEvent m) {}
		public void mouseEntered(MouseEvent m) {}
		public void mouseExited(MouseEvent m) {}
	}

	public MouseTriangleFrame()
	{
		scene = new MouseTriangleComponent();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
	}
}
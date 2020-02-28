import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
	private TriangleComponent scene;

	class MousePressListener implements MouseListener
	{
		public void mousePressed(MouseEvent me)
		{
			int x = me.getX();
			int y = me.getY();
			scene.recordPoint(x, y);
			scene.drawPoints();
		}

		public void mouseReleased(MouseEvent me) {}
		public void mouseClicked(MouseEvent me) {}
		public void mouseEntered(MouseEvent me) {}
		public void mouseExited(MouseEvent me) {}
	}

	public TriangleFrame()
	{
		scene = new TriangleComponent();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
	}
}
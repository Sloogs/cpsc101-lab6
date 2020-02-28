import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class CircleFrame extends JFrame
{
	private CircleComponent scene;

	class MousePressListener implements MouseListener
	{
		public void mousePressed(MouseEvent me)
		{
			int x = me.getX();
			int y = me.getY();
			scene.recordPoint(x, y);
			scene.drawCircle();
		}

		public void mouseReleased(MouseEvent me) {}
		public void mouseClicked(MouseEvent me) {}
		public void mouseEntered(MouseEvent me) {}
		public void mouseExited(MouseEvent me) {}
	}

	public CircleFrame()
	{
		scene = new CircleComponent();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
	}
}
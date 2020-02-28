import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JComponent;

public class MouseTriangleComponent extends JComponent
{
	private static final int MAXPOINTS = 3;
	private int[] xValues = new int[MAXPOINTS];
	private int[] yValues = new int[MAXPOINTS];
	private int pointsRecorded = 0;
	private Polygon polygon;

	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(polygon);
	}

	public void recordPoint(int x, int y)
	{
		if (pointsRecorded == MAXPOINTS) {
			resetPoints();
		}
		xValues[pointsRecorded] = x;
		yValues[pointsRecorded] = y;
		pointsRecorded++;
	}

	public void resetPoints()
	{
		for (int i = 0; i < MAXPOINTS; i++)
		{
			xValues[i] = 0;
			yValues[i] = 0;
			pointsRecorded = 0;
		}
	}

	public void drawPoints()
	{
		if (pointsRecorded == 1)
		{
			int x = xValues[0];
			int y = yValues[0];
			polygon = new Polygon();
			polygon.addPoint(x, y);
			polygon.addPoint(x + 1, y + 1);
			repaint();
		}
		else
		{
			polygon = new Polygon(xValues, yValues, pointsRecorded);
			repaint();
		}
	}
}
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
	private static final int MAXPOINTS = 2;
	private int[] xValues = new int[MAXPOINTS];
	private int[] yValues = new int[MAXPOINTS];
	private int pointsRecorded = 0;
	private Ellipse2D.Double circle;

	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(circle);
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

	public void drawCircle()
	{
		if (pointsRecorded == MAXPOINTS){
			double centerX = xValues[0];
			double centerY = yValues[0];
			double radiusX = xValues[1];
			double radiusY = yValues[1];
			double width = (radiusX - centerX);
			double height = (radiusY - centerY);
			double diameter = (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))) * 2;
			double x = centerX - (diameter / 2);
			double y = centerY - (diameter / 2);
			circle = new Ellipse2D.Double(x, y, diameter, diameter);
			repaint();
		}
	}
}
package cpsc101.nickslugocki.lab6;

/**
* This file is part of a solution to
*     CPSC 101, Winter 2020, Lab 6, Problem P10.26
*
* This program sets up the frame for records mouse clicks for up two points. It then uses the two
* points to draw a circle.
* The first point given is the radius.
* The second point given will draw the perimeter of the circle.
*
* This class creates the main method and represents a Java Swing Component class for our program's
* GUI elements.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

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
	private Ellipse2D.Double circle = new Ellipse2D.Double();

	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(circle);
	}

	/**
	* Records a point at the given x and y values.
	* @param x x-value
	* @param y y-value
	* @return Nothing
	*/
	public void recordPoint(int x, int y)
	{
		if (pointsRecorded == MAXPOINTS) {
			resetPoints();
		}
		xValues[pointsRecorded] = x;
		yValues[pointsRecorded] = y;
		pointsRecorded++;
	}

	/**
	* Resets the list of recorded points.
	* @return Nothing
	*/
	public void resetPoints()
	{
		for (int i = 0; i < MAXPOINTS; i++)
		{
			xValues[i] = 0;
			yValues[i] = 0;
			pointsRecorded = 0;
		}
	}

	/**
	* Draws a circle using the given points that are recorded by the class.
	* @return Nothing
	*/
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
package cpsc101.nickslugocki.lab6;

/**
* This file is part of a solution to
*     CPSC 101, Winter 2020, Lab 6, Problem P10.16
*
* This program sets up the frame for records mouse clicks for up to three points and draws a
* triangle.
* If one points are given, only a point is drawn.
* If two points are given, a line is drawn.
* If three points are given, a triangle is drawn.
* The points reset after 3 clicks.
*
* This class represents the Java Swing Component for our program's GUI elements.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
	private static final int MAXPOINTS = 3;
	private int[] xValues = new int[MAXPOINTS];
	private int[] yValues = new int[MAXPOINTS];
	private int pointsRecorded = 0;
	private Polygon polygon = new Polygon();

	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(polygon);
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
	* Draws up to three points. A single point will result in just a point. Two points will draw
	* a line. Three points draws a triangle.
	* @return Nothing
	*/
	public void drawPoints()
	{
		if (pointsRecorded == 1)
		{
			int x = xValues[0];
			int y = yValues[0];
			polygon = new Polygon();
			polygon.addPoint(x, y);
			polygon.addPoint(x, y + 1);
			repaint();
		}
		else
		{
			polygon = new Polygon(xValues, yValues, pointsRecorded);
			repaint();
		}
	}
}
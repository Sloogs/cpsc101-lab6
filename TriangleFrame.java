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
* This class represents the Java Swing JFrame for our program's GUI elements.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

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

	/**
	* Constructor for TriangleFrame.
	*/
	public TriangleFrame()
	{
		scene = new TriangleComponent();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
	}
}
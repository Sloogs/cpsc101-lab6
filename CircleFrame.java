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
* This class creates the main method and represents a Java Swing JFrame class for our program's
* GUI elements.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

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

	/**
	* Constructor for Circle Frame
	*/
	public CircleFrame()
	{
		scene = new CircleComponent();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
	}
}
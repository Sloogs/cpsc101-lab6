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
* This class creates the main method and represents a Viewer class for our program's GUI elements..
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class CircleViewer
{
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args)
	{
		JFrame frame = new CircleFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
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
* This class creates the main method and represents a Viewer class for our program's GUI elements.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class TriangleViewer
{
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
	private static int buttonAClickCount = 0;
	private static int buttonBClickCount = 0;

	public static void main(String[] args)
	{
		JFrame frame = new TriangleFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
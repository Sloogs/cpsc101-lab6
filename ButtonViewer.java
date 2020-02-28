package cpsc101.nickslugocki.lab6;

/**
* This file is part of a solution to
*     CPSC 101 Winter 2020, Lab 6, Problems E10.17-E10.21, 
*
* This program creates a set of two buttons and records when the buttons are pressed.
*
* @author Nicholas Slugocki
* Student Number: 230082267
* @version 1
*/

import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class ButtonViewer
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	private static int buttonAClickCount = 0;
	private static int buttonBClickCount = 0;

	public static void main(String[] args)
	{
		// Create frame
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();

		// Create and set up panels
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

		// Create buttons and labels, set fonts.
		JButton buttonA = new JButton("Button A");
		JButton buttonB = new JButton("Button B");
		Label labelA = new Label("Button A was clicked 0 times!", Label.CENTER);
		Label labelB = new Label("Button B was clicked 0 times!", Label.CENTER);
		labelA.setFont(new Font("Arial", Font.BOLD, 16));
		labelB.setFont(new Font("Arial", Font.BOLD, 16));

		// Add components to panels.
		buttonPanel.add(buttonA);
		buttonPanel.add(buttonB);
		textPanel.add(labelA);
		textPanel.add(labelB);
		mainPanel.add(buttonPanel);
		mainPanel.add(textPanel);
		frame.add(mainPanel);

		// Check to see how many times Button A is clicked.
		buttonA.addActionListener(
			(ActionEvent ae) -> {
				buttonAClickCount++;
				labelA.setText("Button A was clicked " + buttonAClickCount + " times!");
			}
		);

		// Check to see how many times Button B is clicked.
		buttonB.addActionListener(
			(ActionEvent ae) -> {
				buttonBClickCount++;
				labelB.setText("Button B was clicked " + buttonBClickCount + " times!");
			}
		);

		// Set up window size, visibility, close operation.
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
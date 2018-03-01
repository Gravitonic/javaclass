/*
 * Programmer: Dylan Yang
 * Date: Feb 14, 2018
 * Purpose: to create a panel that draws a moving shape bouncing off the edges of the window 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MovingShapesPanel extends JPanel implements ActionListener {
	
	private int xMoved, yMoved;
	private JFrame f = new JFrame("MovingShapesPanel");
	private boolean xBackward = false, yBackward = false; // true if x or y coordinate is decreasing

	public MovingShapesPanel() {
		Timer t = new Timer(5, this);
		t.start();
	}
	
	public void paintComponent(Graphics g) {
		g.fillOval(xMoved, yMoved, 50, 50);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (xMoved >= f.getWidth() - 50)
			xBackward = true;
		else if (xMoved <= 0)
			xBackward = false;

		if (yMoved >= f.getHeight() - 70)
			yBackward = true;
		else if (yMoved <= 0)
			yBackward = false;		

		if (xBackward)
			xMoved--;
		else
			xMoved++;
		
		if (yBackward)
			yMoved--;
		else
			yMoved++;

		repaint();
		
	}
	
	public void setupWindow(MovingShapesPanel p) {
		
		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

		p.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		MovingShapesPanel p = new MovingShapesPanel();
		p.setupWindow(p);
		
	}
	
}

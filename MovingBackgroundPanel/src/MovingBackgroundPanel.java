/*
 * Programmer: Dylan Yang
 * Date: Feb 26, 2018
 * Purpose: to create a JPanel subclass with a moving background image 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class MovingBackgroundPanel extends JPanel implements ActionListener {

	private Image bg;
	private int bgWidth, bgHeight;
	private int bgX;
	private int direction = 1;

	public MovingBackgroundPanel(int timerSpeed) {
		ImageIcon i = new ImageIcon("src/background.jpg");
		bg = i.getImage();
		bgWidth = bg.getWidth(null);
		bgHeight = bg.getHeight(null);

		Timer timer = new Timer(timerSpeed, this);
	}

	public int getWidth() {
		return bgWidth;
	}

	public int getHeight() {
		return bgHeight;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(bg, bgX, 0, null);

		g2d.drawImage(bg, bgX - bgWidth, 0, null);
	}

	public void actionPerformed(ActionEvent e) {
		if (Math.abs(bgX) >= bgWidth)
			bgX = 0;
		else
			bgX += direction;
		repaint();
	}

	public void setupWindow(MovingBackgroundPanel p, JFrame f) {
		f.setSize(p.getWidth(), p.getHeight());

		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("Moving Background");
		MovingBackgroundPanel p = new MovingBackgroundPanel(5);

		p.setupWindow(p, f);
	}


}

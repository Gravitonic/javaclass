/*
 * Programmer: Dylan Yang
 * Date: Feb 26, 2018
 * Purpose: to create a JPanel subclass with a background image 
 */

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class BackgroundPanel extends JPanel {

	private Image bg;
	private int bgWidth, bgHeight;

	public BackgroundPanel() {
		ImageIcon i = new ImageIcon("src/background.jpg");
		bg = i.getImage();
		bgWidth = bg.getWidth(null);
		bgHeight = bg.getHeight(null);
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
		g2d.drawImage(bg, 0, 0, null);
	}

	public void setupWindow(BackgroundPanel p, JFrame f) {
		f.setSize(p.getWidth(), p.getHeight());

		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Background");
		BackgroundPanel p = new BackgroundPanel();
		p.setupWindow(p, f);
	}

}

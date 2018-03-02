package examples;
/**
 * Programmer: Dylan Yang
 * Date: Feb 12, 2018
 * Purpose: to create a class that extends JPanel and generates a shape when the mouse is clicked
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class PaintOnClickPanel extends JPanel implements MouseListener {

	// Polygon[] possibleShapes = new Polygon[10];
	private final int NUM_SHAPES = 1000000;
	private Polygon[] shapes = new Polygon[NUM_SHAPES];
	private int shapesDrawn = 0;
	private JFrame f;
	private Color[] colors = new Color[NUM_SHAPES];

	public PaintOnClickPanel() {
		addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paintComponent()");
		if (shapesDrawn != 0) {
			for (int i = 0; i < shapesDrawn; i++) {
				g.setColor(colors[i]);
				g.fillPolygon(shapes[i]);
			}
		}
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseClicked()");

		int size = (int) (Math.random() * 50) + 20; // half of width and height

		int[] xPoints = {e.getX() - size, e.getX() + size, e.getX() + size, e.getX() - size};
		int[] yPoints = {e.getY() - size, e.getY() - size, e.getY() + size, e.getY() + size};

		if (shapesDrawn < NUM_SHAPES) {
				shapes[shapesDrawn] = new Polygon(xPoints, yPoints, xPoints.length);
			colors[shapesDrawn] = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), 100);
		}
		shapesDrawn++;

		repaint();
	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void setupWindow(PaintOnClickPanel p) {
		f = new JFrame("PaintOnClickPanel");

		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

		p.requestFocusInWindow();
	}

	public static void main(String[] args) {
		PaintOnClickPanel p = new PaintOnClickPanel();
		p.setupWindow(p);
	}

}

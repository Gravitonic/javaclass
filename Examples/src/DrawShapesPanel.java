/*
 * Programmer: Dylan Yang
 * Date: Feb 6, 2018
 * Purpose: to create a work of art 
 */

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DrawShapesPanel extends JPanel {

	JFrame f;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		int[] xPoints = new int[3], yPoints = new int[3];
		int nPoints = 3;
		int randCircleDiameter;

		g2D.setColor(Color.LIGHT_GRAY);
		g2D.setStroke(new BasicStroke(2));

		// background
		for (int x = -50; x < f.getWidth(); x += 50)
			for (int y = -50; y < f.getHeight(); y += 50)
				g2D.drawOval(x, y, 100, 100);
		
		g2D.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), 100));
		g2D.fillRect(0, 0, f.getWidth(), f.getHeight());
		
		for (int i = 0; i < 20; i++) {
			
			// triangles
			for (int j = 0; j < xPoints.length; j++) {
				xPoints[j] = (int) (Math.random() * f.getWidth());
				yPoints[j] = (int) (Math.random() * f.getHeight());
			}
			g2D.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 100)));
			g2D.fillPolygon(xPoints, yPoints, nPoints);
			
			// circle
			g2D.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 150)));
			randCircleDiameter = (int) (Math.random() * 50 + 50);
			g2D.fillOval((int) (Math.random() * f.getWidth()), (int) (Math.random() * f.getHeight()), 
					randCircleDiameter, randCircleDiameter);
		}
		
	}

	public void setupWindow(DrawShapesPanel p) {
		f = new JFrame("My Painting");

		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		DrawShapesPanel p = new DrawShapesPanel();
		p.setupWindow(p);
	}
}

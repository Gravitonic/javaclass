/*
 * Programmer: Dylan Yang
 * Date: Feb 8, 2018
 * Purpose: to implement MouseListener to create buttons using 
 */

// BUG: Label disappears after same button is clicked twice

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MouseClickButtonPanel extends JPanel implements MouseListener {
	
	private JFrame f;
	private JLabel l;
	private Polygon rect1, rect2;
	private boolean clicked1, clicked2;
	
	public MouseClickButtonPanel() {
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		rect1 = new Polygon();
		rect1.addPoint(10, 10);
		rect1.addPoint(f.getWidth() / 2 - 5, 10);
		rect1.addPoint(f.getWidth() / 2 - 5, f.getHeight() / 2 - 30);
		rect1.addPoint(10, f.getHeight() / 2 - 30);
		
		rect2 = new Polygon();
		rect2.addPoint(f.getWidth() / 2 + 5, 10);
		rect2.addPoint(f.getWidth() - 10, 10);
		rect2.addPoint(f.getWidth() - 10, f.getHeight() / 2 - 30);
		rect2.addPoint(f.getWidth() / 2 + 5, f.getHeight() / 2 - 30);
		
		if (clicked1) {
			rect1.translate(0, 10);
		} else if (clicked2) {
			rect2.translate(0, 10);
		}
		
		g.fillPolygon(rect1);
		g.fillPolygon(rect2);
		
		rect1.translate(0, -10);
		rect2.translate(0, -10);
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		if (e.getX() >= rect1.getBounds().getX() && e.getX() <= rect1.getBounds().getMaxX() &&
				e.getY() >= rect1.getBounds().getY() && e.getY() <= rect1.getBounds().getMaxY())
			clicked1 = true;
		else if (e.getX() >= rect2.getBounds().getX() && e.getX() <= rect2.getBounds().getMaxX() &&
				e.getY() >= rect2.getBounds().getY() && e.getY() <= rect2.getBounds().getMaxY())
			clicked2 = true;
		
		this.repaint();
		
	}
	
	public void mouseReleased(MouseEvent e) {
		clicked1 = false;
		clicked2 = false;
		
		this.repaint();
	}

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("mouseClicked");
		
		if (e.getX() >= rect1.getBounds().getX() && e.getX() <= rect1.getBounds().getMaxX() &&
				e.getY() >= rect1.getBounds().getY() && e.getY() <= rect1.getBounds().getMaxY()) {
			System.out.println("Button 1 was clicked.");
			l.setText("Button 1 was clicked.");
			l.setVisible(true);
		}
		else if (e.getX() >= rect2.getBounds().getX() && e.getX() <= rect2.getBounds().getMaxX() &&
				e.getY() >= rect2.getBounds().getY() && e.getY() <= rect2.getBounds().getMaxY()) {
			System.out.println("Button 2 was clicked.");
			l.setText("Button 2 was clicked.");
			l.setVisible(true);
		}
		
		this.repaint();
		
	}
	
	public void mouseEntered(MouseEvent e) {}
	
	public void mouseExited(MouseEvent e) {}
	
	public void setupWindow(MouseClickButtonPanel p) {
		
		f = new JFrame("Drawing Example");
		l = new JLabel();
		
		l.setSize(300, 200);
		
		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l);
		f.add(p);
		
		// must be set after f.setSize() has been called
		l.setLocation(f.getWidth() / 2 - 10 - 150, f.getHeight() / 2 - 30 + 10);
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		MouseClickButtonPanel p = new MouseClickButtonPanel();
		
		p.setupWindow(p);
		
	}
	
}

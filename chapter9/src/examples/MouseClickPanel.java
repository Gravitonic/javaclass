package examples;
/*
 * Programmer: Dylan Yang
 * Date: Feb 8, 2018
 * Purpose: to create a program that implements MouseListener 
 */

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class MouseClickPanel extends JPanel implements MouseListener {
	
	public MouseClickPanel () {
		addMouseListener(this);
	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		System.out.println(e);
		System.out.println();
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		System.out.println(e);
		System.out.println();
	}
	
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		System.out.println(e);
		System.out.println();
	}
	
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
		System.out.println(e);
		System.out.println();
	}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
		System.out.println(e);
		System.out.println();
	}
	
	public void setupWindow(MouseClickPanel p) {
		JFrame f = new JFrame("Mouse Click Panel");
		
		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		MouseClickPanel p = new MouseClickPanel();

		p.setupWindow(p);
	}
}
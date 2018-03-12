package examples;

/*
 * Programmer: Dylan Yang
 * Date: Feb 2, 2018
 * Purpose: to create a window with buttons 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonWindow implements ActionListener {

	private JFrame f;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private Point prevLocation;
	private Dimension prevSize;

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == b1)
			System.out.println(event.getActionCommand() + " was pressed.");
		else if (event.getSource() == b2)
			System.out.println("Button 2 was pressed");
		else if (event.getSource() == b3)
			System.exit(0);
		else if (event.getSource() == b4) {
			prevLocation = f.getLocation();
			prevLocation.translate(10, 10);
			setupWindow(prevLocation);
		} else if (event.getSource() == b5) {
			prevLocation = f.getLocation();
			prevSize = f.getSize();
			f.dispose();
			setupWindow(prevLocation, prevSize);
		}

	}

	public void setupWindow() {

		f = new JFrame("Button Window");
		JPanel p = new JPanel();

		p.setLayout(new FlowLayout());

		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		p.add(b1);

		b2 = new JButton("Button 2");
		b2.addActionListener(this);
		p.add(b2);

		b3 = new JButton("EXIT");
		b3.addActionListener(this);
		p.add(b3);

		b4 = new JButton("CLONE");
		b4.addActionListener(this);
		p.add(b4);

		b5 = new JButton("RESTART");
		b5.addActionListener(this);
		p.add(b5);
		
		b6 = new JButton("DISABLED");
		b6.setEnabled(false);
		p.add(b6);

		f.add(p, "Center");

		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	
	public void setupWindow(Point location) {

		f = new JFrame("Button Window");
		JPanel p = new JPanel();

		p.setLayout(new FlowLayout());

		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		p.add(b1);

		b2 = new JButton("Button 2");
		b2.addActionListener(this);
		p.add(b2);

		b3 = new JButton("EXIT");
		b3.addActionListener(this);
		p.add(b3);

		b4 = new JButton("CLONE");
		b4.addActionListener(this);
		p.add(b4);

		b5 = new JButton("RESTART");
		b5.addActionListener(this);
		p.add(b5);
		
		b6 = new JButton("DISABLED");
		b6.setEnabled(false);
		p.add(b6);

		f.add(p, "Center");

		f.setSize(300, 300);
		f.setLocation(location);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	
	public void setupWindow(Point location, Dimension size) {

		f = new JFrame("Button Window");
		JPanel p = new JPanel();

		p.setLayout(new FlowLayout());

		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		p.add(b1);

		b2 = new JButton("Button 2");
		b2.addActionListener(this);
		p.add(b2);

		b3 = new JButton("EXIT");
		b3.addActionListener(this);
		p.add(b3);

		b4 = new JButton("CLONE");
		b4.addActionListener(this);
		p.add(b4);

		b5 = new JButton("RESTART");
		b5.addActionListener(this);
		p.add(b5);
		
		b6 = new JButton("DISABLED");
		b6.setEnabled(false);
		p.add(b6);

		f.add(p, "Center");

		f.setSize((int)size.getWidth(), (int)size.getHeight());
		f.setLocation(location);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		ButtonWindow w = new ButtonWindow();
		w.setupWindow();

	}

	/*
	public static void main(String[] args) {

		ButtonWindow w = new ButtonWindow();
		w.setupWindow();

	}

	public void setupWindow() {

		JFrame f = new JFrame("Button Window");
		JPanel p = new JPanel();

		p.setLayout(new FlowLayout());

		JButton b1 = new JButton("Button 1");
		p.add(b1);
		JButton b2 = new JButton("Button 2");
		p.add(b2);

		f.add(p, "Center");

		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
	 */

}

/*
 * Programmer: Dylan Yang
 * Date: Feb 2, 2018
 * Purpose: to create a window with buttons 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonWindow implements ActionListener {

	private JButton b1;
	private JButton b2;
	private JButton b3;

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1)
			System.out.println("Button 1 was pressed");
		else if (e.getSource() == b2)
			System.out.println("Button 2 was pressed");
		else if (e.getSource() == b3)
			System.exit(0);

	}

	public static void main(String[] args) {

		ButtonWindow w = new ButtonWindow();
		w.setupWindow();

	}

	public void setupWindow() {

		JFrame f = new JFrame("Button Window");
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

		f.add(p, "Center");

		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

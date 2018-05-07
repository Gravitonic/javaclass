package gridlayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWindow implements ActionListener {
	
	private JButton b1, b2, b3, b4, b5, b6;
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1)
			System.out.println("Button 1 was pressed");
		else if (e.getSource() == b2)
			System.out.println("Button 2 was pressed");
		else if (e.getSource() == b3)
			System.out.println("Button 3 was pressed");
		else if (e.getSource() == b4)
			System.out.println("Button 4 was pressed");
		else if (e.getSource() == b5)
			System.out.println("Button 5 was pressed");
		else if (e.getSource() == b6)
			System.exit(0);
		
	}
	
	public void setupWindow() {
		
		JFrame f = new JFrame("Displaying a grid layout");
		JPanel p = new JPanel();
		
		p.setLayout(new GridLayout(2,3));
		
		b1 = new JButton("Button 1");
		b1.addActionListener(this);
		p.add(b1);
		
		b2 = new JButton("Button 2");
		b2.addActionListener(this);
		p.add(b2);
		
		b3 = new JButton("Button 3");
		b3.addActionListener(this);
		p.add(b3);
		
		b4 = new JButton("Button 4");
		b4.addActionListener(this);
		p.add(b4);
		
		b5 = new JButton("Button 5");
		b5.addActionListener(this);
		p.add(b5);
		
		b6 = new JButton("EXIT");
		b6.addActionListener(this);
		p.add(b6);
		
		f.getContentPane().add(p, "Center");
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MyWindow fw = new MyWindow();
		fw.setupWindow();
	}
	
}
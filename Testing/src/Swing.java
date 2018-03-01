
/* THIS IS NOT MY WORK. */

import javax.swing.*;  

public class Swing {  

	public static void main(String[] args) {

		JFrame f = new JFrame(); //creating instance of JFrame
		
		JLabel label1 = new JLabel(), label2 = new JLabel();
		label1.setText("Caandorfian Missile Launch System");
		label1.setBounds(50,50, 500,30);

		JButton b = new JButton("Launch"); //creating instance of JButton
		b.setBounds(130,100,100,40); //x axis, y axis, width, height
		label2.setBounds(50,100, 100,30);

		f.add(label1);
		f.add(label2);
		f.add(b); //adding button in JFrame

		f.setSize(400,500); //400 width and 500 height
		f.setLayout(null); //using no layout managers
		f.setVisible(true); //making the frame visible
		
	}

}

import javax.swing.*;

public class Swing2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		JLabel label1 = new JLabel();
		label1.setText("Caandorfian Missile Launch System");
		label1.setBounds(50, 50, 500, 30);

		JButton b = new JButton("Launch");
		b.setBounds(140, 100, 100, 40); // x axis, y axis, width, height

		f.add(label1);
		f.add(b); //adding button in JFrame

		f.setSize(400, 500); // width, height
		f.setLayout(null);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

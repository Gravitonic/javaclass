package layouts;

/* This is an example from the textbook (p. 149). */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo implements ActionListener {
	
	JPanel cards; //The top level container to hold all of the 'cards'
	
	public static void main(String[] args) {
		CardLayoutDemo cl = new CardLayoutDemo();
		cl.setup();
	}
	
	public void actionPerformed(ActionEvent e) {
		//Check to see what menu item the user chose
		if (e.getActionCommand().equals("Go to Card1")) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "C1");
		}
		else if (e.getActionCommand().equals("Go to Card2")) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "C2");
		}
		else // Assume they chose exit if no others...
			System.exit(0);
	}
	
	public void setup() {
		JFrame f = new JFrame("Card Layout");
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		
		// Declare the 3 menu items.
		JMenuItem eMenuItem = new JMenuItem("Exit");
		JMenuItem eMenuItem2 = new JMenuItem("Go to Card1");
		JMenuItem eMenuItem3 = new JMenuItem("Go to Card2");
		
		eMenuItem.addActionListener(this);
		eMenuItem2.addActionListener(this);
		eMenuItem3.addActionListener(this);
		
		// Add the 3 menu items to the file menu
		file.add(eMenuItem2);
		file.add(eMenuItem3);
		file.add(eMenuItem); // Exit Menu item
		
		// Add the file menu to the menubar
		menubar.add(file);
		f.setJMenuBar(menubar);
		
		// Create the high level container for the cards
		cards = new JPanel(new CardLayout());
		
		//Create a button, one for each card so we can see the difference
		JButton Card1Button = new JButton("This is Card1");
		card1.add(Card1Button);
		JButton Card2Button = new JButton("This is Card2");
		card2.add(Card2Button);
		
		// Add the cards to the high level card container
		cards.add(card1, "C1");
		cards.add(card2, "C2");
		
		// Add the card layout to the frame.
		f.add(cards, BorderLayout.CENTER);
		
		f.setTitle("Simple menu");
		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

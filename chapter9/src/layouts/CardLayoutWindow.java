package layouts;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import background.MovingBackgroundPanel;
import movingshapeswithmenu.MovingShapesPanel;

public class CardLayoutWindow implements ActionListener {

	JPanel cardsContainer;

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Card 1")) {
			CardLayout cl = (CardLayout)(cardsContainer.getLayout());
			cl.show(cardsContainer, "card1");
		} else if (e.getActionCommand().equals("Card 2")) {
			CardLayout cl = (CardLayout)(cardsContainer.getLayout());
			System.out.println("card 2");
			cl.show(cardsContainer, "card2");
		}
	}

	public void setup() {

		JFrame f = new JFrame("Card Layout Window");

		JPanel buttonsContainer = new JPanel();

		f.setLayout(new GridLayout(2,1));

		JButton button1 = new JButton("Card 1");
		button1.setActionCommand("Card 1");
		JButton button2 = new JButton("Card 2");
		button2.setActionCommand("Card 2");
		buttonsContainer.add(button1);
		buttonsContainer.add(button2);
		f.add(buttonsContainer);

		cardsContainer = new JPanel(new CardLayout());
		
		MovingBackgroundPanel card1 = new MovingBackgroundPanel(10);
		MovingShapesPanel card2 = new MovingShapesPanel(10);
		cardsContainer.add(card1, "card1");
		cardsContainer.add(card2, "card2");

		f.add(cardsContainer, BorderLayout.CENTER);

		f.setSize(600, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		CardLayoutWindow window = new CardLayoutWindow();
		window.setup();
	}

}

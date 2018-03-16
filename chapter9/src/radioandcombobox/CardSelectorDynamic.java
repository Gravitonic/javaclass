package radioandcombobox;

/*
 * Programmer: Dylan Yang
 * Date: Mar 15, 2018
 * Purpose: to create a program that uses radio buttons and a combo box to switch panels
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import background.*;
import movingshapeswithmenu.*;

public class CardSelectorDynamic implements ActionListener {

	private  int NUM_CARDS;
	private JFrame frame;
		private JPanel controlsPanel;
			private JPanel radioPanel;
			private ButtonGroup radioGroup;
				private	JRadioButton[] radioButtons;
			private JPanel comboBoxPanel;
				private JComboBox comboBox;
		private JPanel cardsPanel;
			private JPanel[] cards;
			private JLabel[] cardLabels;

	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(cardsPanel.getLayout());
		
	}

	public void setNumCards() {
		NUM_CARDS = Integer.parseInt(JOptionPane.showInputDialog(frame, "Number of Cards:", "3"));
		System.out.println(NUM_CARDS);
		radioButtons = new JRadioButton[NUM_CARDS];
		cards = new JPanel[NUM_CARDS];
	}

	public void setup() {
		frame = new JFrame("Card Selector");
		frame.setLayout(new GridLayout(2,1));

		controlsPanel = new JPanel(new GridLayout(1,2));

		radioPanel = new JPanel();
		radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
		radioGroup = new ButtonGroup();
		for (int i = 0; i < radioButtons.length; i++) {
			radioButtons[i] = new JRadioButton("Card " + (i + 1));
			radioButtons[i].setActionCommand("radio " + i);
			radioGroup.add(radioButtons[i]);
			radioPanel.add(radioButtons[i]);
		}
		controlsPanel.add(radioPanel);
		
		comboBoxPanel = new JPanel();
		String[] comboOptions = new String[NUM_CARDS];
		for (int i = 0; i < comboOptions.length; i++)
			comboOptions[i] = "Card " + (i + 1);
		comboBox = new JComboBox(comboOptions);
		comboBoxPanel.add(comboBox);
		controlsPanel.add(comboBoxPanel);
		
		frame.add(controlsPanel);
		
		cardsPanel = new JPanel(new CardLayout());
		for (int i = 0; i < cards.length; i++) {
			cardLabels[i] = new JLabel("This is card " + (i + 1));
			cards[i].add(cardLabels[i]);
			cardsPanel.add(cards[i]);
		}
		cards[0] = new MovingBackgroundPanel(10 /* milliseconds */);
		frame.add(cardsPanel);

		frame.setSize(600, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		CardSelectorDynamic window = new CardSelectorDynamic();
		window.setNumCards();
		window.setup();
	}

}
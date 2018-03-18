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

	private int NUM_CARDS;
	private JFrame frame;
	private JPanel controlsPanel;
	private JPanel radioPanel;
	private ButtonGroup radioGroup;
	private	JRadioButton[] radioButtons;
	private JPanel comboBoxPanel;
	private JComboBox<String> comboBox;
	private String[] comboOptions;
	private JPanel cardsPanel;
	private JPanel[] cards;
	private JLabel[] cardLabels;

	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(cardsPanel.getLayout());
		if (e.getSource() == comboBox) {
			cl.show(cardsPanel, "Card " + comboBox.getSelectedIndex());
			radioButtons[comboBox.getSelectedIndex()].setSelected(true);
		} else {
			for (int i = 0; i < NUM_CARDS; i++) {
				if (e.getSource() == radioButtons[i]) {
					cl.show(cardsPanel, "Card " + i);
					comboBox.setSelectedIndex(i);
				}
			}
		}
	}

	public void setNumCards() {
		NUM_CARDS = Integer.parseInt(JOptionPane.showInputDialog(frame, "Number of Cards:", "3"));
		System.out.println(NUM_CARDS);
		radioButtons = new JRadioButton[NUM_CARDS];
		cards = new JPanel[NUM_CARDS];
		cardLabels = new JLabel[NUM_CARDS];
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
			radioButtons[i].addActionListener(this);
			radioButtons[i].setHorizontalAlignment(SwingConstants.CENTER);
			radioGroup.add(radioButtons[i]);
			radioPanel.add(radioButtons[i]);
		}
		radioButtons[0].setSelected(true);
		controlsPanel.add(radioPanel);

		comboBoxPanel = new JPanel();
		comboOptions = new String[NUM_CARDS];
		for (int i = 0; i < comboOptions.length; i++)
			comboOptions[i] = "Card " + (i + 1);
		comboBox = new JComboBox<String>(comboOptions);
		comboBox.addActionListener(this);
		comboBoxPanel.add(comboBox);
		controlsPanel.add(comboBoxPanel);

		frame.add(controlsPanel);

		cardsPanel = new JPanel(new CardLayout());
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new JPanel();
			cardLabels[i] = new JLabel("This is card " + (i + 1));
			cards[i].add(cardLabels[i]);
			if (i == 0) {
				cards[i] = new MovingBackgroundPanel(10);
				cardsPanel.add(cards[i], "Card " + i);
			} else if (i == 1) {
				cards[i] = new MovingShapesPanel(10);
				((MovingShapesPanel) cards[i]).setupBlock(MovingShapesPanel.TOP_LEFT, 50, 50);
				cardsPanel.add(cards[i], "Card " + i);
			} else
				cardsPanel.add(cards[i], "Card " + i);
		}
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
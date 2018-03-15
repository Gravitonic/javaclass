package textinput;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextPrinter implements ActionListener {
	
	JTextField textField;
	JLabel printer;

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("submit")) {
			printer.setText(textField.getText());
			textField.setText(null);
		} else if (e.getActionCommand().equals("clear")) {
			textField.setText(null);
		} else if (e.getActionCommand().equals("exit")) {
			System.exit(0);
		}
	}

	public void setup() {

		JFrame f = new JFrame("Text Printer");
		f.setLayout(new GridLayout(3,1));

		JPanel controlPanel = new JPanel();
		JButton submit = new JButton("Submit"), clear = new JButton("Clear"), exit = new JButton("Exit");
		submit.setActionCommand("submit");
		submit.addActionListener(this);
		controlPanel.add(submit);
		clear.setActionCommand("clear");
		clear.addActionListener(this);
		controlPanel.add(clear);
		exit.setActionCommand("exit");
		exit.addActionListener(this);
		controlPanel.add(exit);
		f.add(controlPanel);

		JPanel textFieldPanel = new JPanel();
		JLabel textPrompt = new JLabel("Enter Something: ");
		textFieldPanel.add(textPrompt);
		textField = new JTextField(30);
		textFieldPanel.add(textField);
		f.add(textFieldPanel);
		
		printer = new JLabel();
		printer.setHorizontalAlignment(SwingConstants.CENTER);
		f.add(printer);
		
		f.setSize(600, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		TextPrinter window = new TextPrinter();
		window.setup();
		
	}

}

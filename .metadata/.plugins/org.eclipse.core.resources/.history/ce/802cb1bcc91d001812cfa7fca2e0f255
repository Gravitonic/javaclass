/*
 * Programmer: Dylan Yang
 * Date: Feb 15, 2018
 * Purpose: to display a Block 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Display extends JPanel implements ActionListener {

	private JFrame f;
	private JMenuBar menuBar;
	private JMenuItem exitMenuItem;
	private JMenuItem startAllMenuItem;
	private JMenuItem stopAllMenuItem;
	private Block[] blocks = {new Block(), new Block(), new Block(), new Block()};
	private int numBlocks = 0;
	private static final int TOP_LEFT = 1, TOP_RIGHT = 2, BOTTOM_LEFT = 3, BOTTOM_RIGHT = 4 /*, TOP = 5, LEFT = 6, BOTTOM = 7, RIGHT = 8, CENTER = 9 */;
	private Timer t;
	private int timerSpeed;

	public Display() {
		t = new Timer(5, this);
	}

	public Display(int timerSpeed) {
		super();
		this.timerSpeed = timerSpeed;
		t = new Timer(timerSpeed, this);
	}

	public void paintComponent(Graphics g) {

		for (Block b : blocks) {
			g.fillRect(b.getDeltaX(), b.getDeltaY(), b.getWidth(), b.getHeight());
		}

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exitMenuItem) {
			System.exit(0);
		} else if (e.getSource() == startAllMenuItem) {
			for (Block b : blocks)
				b.startTimer();
			t.stop();
		} else if (e.getSource() == stopAllMenuItem) {
			for (Block b : blocks)
				b.stopTimer();
			t.stop();
			System.out.println("t.stop()");
		}

		for (Block b : blocks) {
			b.setPanelWidth(f.getContentPane().getWidth());
			b.setPanelHeight(f.getContentPane().getHeight());
		}

		repaint();

	}

	public void setupWindow(Display p) {

		f = new JFrame("Display");

		menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(this);
		fileMenu.add(exitMenuItem);
		
		JMenu blockMenu = new JMenu("Block");
		
		JMenu startSubMenu = new JMenu("Start");
		
		startAllMenuItem = new JMenuItem("Start");
		startAllMenuItem.addActionListener(this);
		startSubMenu.add(startAllMenuItem);
		
		JMenu stopSubMenu = new JMenu("Stop");
		
		stopAllMenuItem = new JMenuItem("Stop");
		stopAllMenuItem.addActionListener(this);
		stopSubMenu.add(stopAllMenuItem);
		
		blockMenu.add(startSubMenu);
		blockMenu.add(stopSubMenu);
		
		menuBar.add(fileMenu);
		menuBar.add(blockMenu);

		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setJMenuBar(menuBar);

		p.requestFocusInWindow();

	}

	public void setupBlock() {

		blocks[numBlocks] = new Block(0, 0, timerSpeed, 50, 50, f.getContentPane().getWidth(), f.getContentPane().getHeight());

		f.setVisible(true);
		
		menuBar.setPreferredSize(new Dimension(100, 25));

		blocks[numBlocks].setPanelWidth(f.getContentPane().getWidth());
		blocks[numBlocks].setPanelHeight(f.getContentPane().getHeight());

		numBlocks++;

		t.start();

	}

	public void setupBlock(int positionCode, int width, int height) {

		int frameWidth = f.getContentPane().getWidth();
		int frameHeight = f.getContentPane().getHeight();

		switch (positionCode) {

		case 1: // TOP_LEFT
			blocks[numBlocks] = new Block(0, 0, timerSpeed, width, height, frameWidth, frameHeight);
			numBlocks++;
			break;
		case 2: // TOP_RIGHT
			blocks[numBlocks] = new Block(frameWidth - width, 0, timerSpeed, width, height, frameWidth, frameHeight);
			numBlocks++;
			break;
		case 3: // BOTTOM_LEFT
			blocks[numBlocks] = new Block(0, frameHeight - height, timerSpeed, width, height, frameWidth, frameHeight);
			numBlocks++;
			break;
		case 4: // BOTTOM_RIGHT
			blocks[numBlocks] = new Block(frameWidth - width, frameHeight - height, timerSpeed, width, height, frameWidth, frameHeight);
			numBlocks++;
			break;
		}
		
		f.setVisible(true);

		t.start();

	}

	public static void main(String[] args) {

		final int TIMER_SPEED = 5;

		Display p = new Display(TIMER_SPEED);

		p.setupWindow(p);
		p.setupBlock(TOP_LEFT, 50, 50);
		p.setupBlock(TOP_RIGHT, 50, 50);
		p.setupBlock(BOTTOM_LEFT, 50, 50);
		p.setupBlock(BOTTOM_RIGHT, 50, 50);

	}

}

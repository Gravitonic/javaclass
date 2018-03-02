package examples;
/*
 * Programmer: Dylan Yang
 * Date: Feb 1, 2018
 * Purpose: to create a window using Swing 
 */

import javax.swing.*;
import java.util.Scanner;

public class FirstWindow {
	
	public static void main(String[] args) {
		
		FirstWindow w = new FirstWindow();
		Scanner in = new Scanner(System.in);
		String title;
		int width, height;
		JFrame f = new JFrame("First");
		
		w.setupWindow(f);
		
		System.out.print("Window Title: ");
		title = in.nextLine();
		
		System.out.print("Width: ");
		width = in.nextInt();
		
		System.out.print("Height: ");
		height = in.nextInt();
		
		w.setupWindow(f, title, width, height);
		
		in.close();
		
	}
	
	public void setupWindow(JFrame f) {
		f.setTitle("First Window!");
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void setupWindow(JFrame f, String title, int width, int height) {
		f.setTitle(title);
		f.setSize(width, height);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}

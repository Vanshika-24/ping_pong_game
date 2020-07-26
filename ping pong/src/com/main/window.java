package com.main;

import javax.swing.JFrame;

public class window {

	public window(String title,Game game) {
		JFrame frame=new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
		//frame.getContentPane().add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		game.start();
		
	}
}

package _01_nasty_surprise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner {

public static void main(String[] args) {
	
	JFrame e = new JFrame();
	JPanel f = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	trick.setText("Trick");
	treat.setText("Treat");
	trick.addActionListener(this);
	treat.addActionListener(this);
	f.add(trick);
	f.add(treat);
	e.add(f);
	e.pack();
	e.setVisible(true);
}




}

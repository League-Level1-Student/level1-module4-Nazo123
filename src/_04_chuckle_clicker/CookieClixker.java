package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CookieClixker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton firstButton = new JButton();
	JButton secondButton = new JButton();

	public static void main(String[] args) {

		new CookieClixker().makeButtons();
	}

	void makeButtons() {

		firstButton.setText("Joke");
		secondButton.setText("Punchline");
		frame.setVisible(true);
		panel.add(firstButton);
		panel.add(secondButton);
		frame.add(panel);
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		if(e.getSource().equals(firstButton)) {
			JOptionPane.showMessageDialog(null, "Hi!");
			JOptionPane.showMessageDialog(null, "Why did the man give the pony a glass of water?");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Because he was a little horse!");
				
		}
		
	}
}

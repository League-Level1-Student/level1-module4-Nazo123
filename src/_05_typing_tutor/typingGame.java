package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingGame implements KeyListener {
	static JFrame frame = new JFrame();
	char currentLetter;
	JLabel letter = new JLabel();
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		typingGame f = new typingGame();

	}

	public typingGame() {

		frame.addKeyListener(this);
		frame.setTitle("Type or Die");
		frame.setVisible(true);

		currentLetter = generateRandomLetter();


		letter.setText(""+currentLetter);
		letter.setFont(letter.getFont().deriveFont(28.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		frame.add(letter);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		letter.setText(""+currentLetter);
		System.out.println("You Typed "+ currentLetter+"!");
	if (e.getKeyChar()==currentLetter){
			frame.setBackground(Color.GREEN);
			System.out.println("Correct");
		}
	else {
		frame.setBackground(Color.RED);
		System.out.println("Incorrect");
	}
	currentLetter =  generateRandomLetter();
	letter.setText(""+currentLetter);
	
		frame.pack();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

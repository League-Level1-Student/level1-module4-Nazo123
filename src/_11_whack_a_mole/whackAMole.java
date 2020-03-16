package _11_whack_a_mole;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
JButton moleButton;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int random = 0;


	public void drawButtons(int r) {
frame.setTitle("Whack a Button for Fame and Glory");
frame.setVisible(true);

for (int i=0;i<21;i++) {
	if (i==r) {
		moleButton = new JButton();
		moleButton.setText("Mole!");
		moleButton.addActionListener(this);
		panel.add(moleButton);
	}
else {
	JButton jb = new JButton();
	panel.add(jb);
	jb.addActionListener(this);
	panel.add(jb);

	}
}
	



frame.add(panel);
frame.setSize(285,310);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource().equals(moleButton)) {
			
			speak("You are nice");
		}
		else {
			speak("YOUR BAD");
		}
		
		
		
	}

}

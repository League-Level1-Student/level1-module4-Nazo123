package _11_whack_a_mole;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {

int molesWhacked;
JFrame frame;
	JButton moleButton;
	JPanel panel;
	int missed;
	Date e = new Date();
	public void drawButtons(int r) {
	
		
		if (missed == 5) {
		
			
			JOptionPane.showMessageDialog(null,"You lost, you missed 5 times. :)");
			System.exit(0);
		}
		if (molesWhacked==10) {
			
			endGame(e,molesWhacked);
			System.exit(0);
		}
		 frame = new JFrame();
		 panel = new JPanel();
		 frame.repaint();
		 frame.revalidate();
	
frame.setTitle("Whack a Button for Fame and Glory");
frame.setVisible(true);

for (int i=1;i<22;i++) {
	if (i==r) {
		moleButton = new JButton();
		moleButton.setText("Mole!");
		moleButton.addActionListener(this);
		panel.add(moleButton);
			}
else {
	JButton jb = new JButton();
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
	    }}

	
int random() {
	
	Random f = new Random();
	int a = f.nextInt(23);
	
	
	return a;
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " seconds per mole.");
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource().equals(moleButton)) {
			
			speak("You hit the mole");
			molesWhacked++;
		playSound("sound.wav");
	
		}
		else {
			speak("You missed");
	missed++;
		}
		
		
		frame.dispose();
		drawButtons(random());
		
	}

}

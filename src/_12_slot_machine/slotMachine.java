package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class slotMachine implements ActionListener {
	Random rand = new Random();
	int r1 = rand.nextInt(3);
	 int r2 = rand.nextInt(3);
	 int r3 = rand.nextInt(3);
	 int score= 0;
	
	JButton spin; 
	JFrame frame;;
	JPanel panel;


	void run() {
		spin = new JButton();
		frame = new JFrame();
		panel = new JPanel();
		spin.setText("SPIN");
		spin.addActionListener(this);
panel.add(spin);
if (r1==1) {
panel.add(loadImage("1.jpeg"));
}
else if(r1==2) {
	panel.add(loadImage("2.jpeg"));
}
else {
	panel.add(loadImage("3.png"));
}
if (r2==1) {
panel.add(loadImage("1.jpeg"));
}
else if(r2==2) {
	panel.add(loadImage("2.jpeg"));
}
else {
	panel.add(loadImage("3.png"));
}
if (r3==1) {
panel.add(loadImage("1.jpeg"));
}
else if(r3==2) {
	panel.add(loadImage("2.jpeg"));
}
else {
	panel.add(loadImage("3.png"));
}
		
		
		frame.add(panel);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		if(r1==r2&&r2==r3) {
			score ++;
			JOptionPane.showMessageDialog(null, "Winner! You Have Currently Won "+score+" times");
			
			
		}
	}
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
	
		return new JLabel(icon);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		r1 = rand.nextInt(3);
		r2 = rand.nextInt(3);
		r3 = rand.nextInt(3);
		frame.dispose();
		run();
	
	}
	
	
	
}

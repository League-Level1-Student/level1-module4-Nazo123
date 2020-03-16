package _11_whack_a_mole;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int random = 0;


	public void drawButtons(int r) {
frame.setTitle("Whack a Button for Fame and Glory");
frame.setVisible(true);

JButton b0 = new JButton();
JButton b1 = new JButton();
JButton b2 = new JButton();
JButton b3 = new JButton();
JButton b4 = new JButton();
JButton b5 = new JButton();
JButton b6 = new JButton();
JButton b7 = new JButton();
JButton b8 = new JButton();
JButton b9 = new JButton();
JButton b10 = new JButton();
JButton b11 = new JButton();
JButton b12 = new JButton();
JButton b13 = new JButton();
JButton b14 = new JButton();
JButton b15 = new JButton();
JButton b16 = new JButton();
JButton b17 = new JButton();
JButton b18 = new JButton();
JButton b19 = new JButton();
JButton b20 = new JButton();
JButton b21 = new JButton();
JButton b22= new JButton();
JButton b23 = new JButton();

if (r==0) {
	b0.setText("Mole!");
}
if (r==1) {
	b1.setText("Mole!");
}

if (r==2) {
	b2.setText("Mole!");
}

if (r==3) {
	b3.setText("Mole!");
}

if (r==4) {
	b4.setText("Mole!");
}

if (r==5) {
	b5.setText("Mole!");
}

if (r==6) {
	b6.setText("Mole!");
}

if (r==7) {
	b7.setText("Mole!");
}

if (r==8) {
	b8.setText("Mole!");
}

if (r==9) {
	b9.setText("Mole!");
}

if (r==10) {
	b10.setText("Mole!");
}

if (r==11) {
	b11.setText("Mole!");
}

if (r==12) {
	b12.setText("Mole!");
}

if (r==13) {
	b13.setText("Mole!");
}

if (r==14) {
	b14.setText("Mole!");
}

if (r==15) {
	b15.setText("Mole!");
}

if (r==16) {
	b16.setText("Mole!");
}

if (r==17) {
	b17.setText("Mole!");
}

if (r==18) {
	b18.setText("Mole!");
}

if (r==19) {
	b19.setText("Mole!");
}

if (r==20) {
	b20.setText("Mole!");
}

if (r==21) {
	b21.setText("Mole!");
}

if (r==22) {
	b22.setText("Mole!");
}

if (r==23) {
	b23.setText("Mole!");
}
random = r;
b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);

panel.add(b0);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(b5);
panel.add(b6);
panel.add(b7);
panel.add(b8);
panel.add(b9);
panel.add(b10);
panel.add(b11);
panel.add(b12);
panel.add(b13);
panel.add(b14);
panel.add(b15);
panel.add(b16);
panel.add(b17);
panel.add(b18);
panel.add(b19);
panel.add(b20);
panel.add(b21);
panel.add(b22);
panel.add(b23);
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
		String nameOfButton = "b"+random;
		String souce = e.toString();
		if(souce.equalsIgnoreCase(nameOfButton)) {
			
			speak("GOD");
		}
		else {
			speak("YOUR BAD");
		}
		
		
		
	}

}

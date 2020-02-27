package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Runner implements ActionListener {


	
	JFrame e = new JFrame();
	JPanel f = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	public void start () {
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(trick)) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/AZ2ZPmEfjvU/maxresdefault.jpg");
		}
		else{
			
			
			showPictureFromTheInternet("https://study.com/cimages/multimages/16/c37dbaf5-e99d-40e5-9170-4d54c3b713a1_adobestock_118697007.jpeg");
		}
	
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}




}

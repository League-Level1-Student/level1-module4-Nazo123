package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JFrame r = new JFrame();
	JPanel frame = new JPanel();
	JTextField number1 = new JTextField(50);
	JTextField number2 = new JTextField(50);
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JLabel answer = new JLabel();
void start() {
	

	r.setVisible(true);
	r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add.setText("Add");
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	subtract.setText("Minus");
	multiply.setText("Multiply");
	divide.setText("Divide");
	
	frame.add(add);
	

	frame.add(subtract);
	
	frame.add(multiply);

	frame.add(divide);
	
frame.add(number1);
frame.add(number2);
frame.add(answer);
r.add(frame);
r.pack();
}
	
	
	 float add (float number1, float number2) {
		float answer; 
		answer = number1+number2;  
		 return answer;
	}
	 float divide (float number1, float number2) {
		 float answer;
			answer = number1/number2;  
			 return answer;
		}
	 float subtract (float number1, float number2) {
		 float answer;
			answer = number1-number2;  
			 return answer;
		}
	 float multiply (float number1, float number2) {
		 float answer;
			answer = number1*number2;  
			 return answer;
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource().equals(add)){
			answer.setText(""+add(Float.parseFloat( number1.getText()),Float.parseFloat(number2.getText())));
		}
		else if (e.getSource().equals(subtract)){
			answer.setText(""+subtract(Float.parseFloat( number1.getText()),Float.parseFloat(number2.getText())));
		}
		else if (e.getSource().equals(divide)){
			answer.setText(""+divide(Float.parseFloat( number1.getText()),Float.parseFloat(number2.getText())));
		}
		else {
			answer.setText(""+multiply(Float.parseFloat( number1.getText()),Float.parseFloat(number2.getText())));
		}
		r.pack();
	}
}

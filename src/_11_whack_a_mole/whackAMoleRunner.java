package _11_whack_a_mole;

import java.util.Random;

public class whackAMoleRunner {
	
	
	public static void main(String[] args) {
		 Random r = new Random();
		 whackAMole e = new whackAMole();
		int random = r.nextInt(23);
		e.drawButtons(random);
		
		
	}
}

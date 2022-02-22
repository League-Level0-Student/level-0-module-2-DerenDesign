package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Random_Lottery_Numbers_Project {
	public static void main(String[] args) {
		String lottery = "";
		for (int i = 0; i <6; i++) {
			int number = 0;
			Random ran = new Random();
			number = ran.nextInt(100);
			lottery += number + "          ";
		}
		JOptionPane.showMessageDialog(null, lottery, "Lottery Numbers", JOptionPane.DEFAULT_OPTION);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class Convert_String_To_Int {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Enter a number:");
		Integer.parseInt(quantity);
		int num = Integer.parseInt(quantity);
		System.out.print(num);
	}
}

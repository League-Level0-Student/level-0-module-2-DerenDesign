package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
	public static void main(String[] args) {
	String Answer = JOptionPane.showInputDialog("How old are you?")	;
	Integer.parseInt(Answer);
	int Age = Integer.parseInt(Answer);
	
	if (Age >= 18) {
		String Ask = JOptionPane.showInputDialog("Who do you think the next president should be:");
		JOptionPane.showMessageDialog(null, "Cool!");
	}
	else if(Age <= 17) {
		JOptionPane.showMessageDialog(null, "No one asked and nobody cares about your opinion and won't for a while!");
	}
}
}

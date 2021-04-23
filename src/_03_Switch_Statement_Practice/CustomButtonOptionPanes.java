package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Hope your weekend was good!");
		break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "*Yawn!* Mondays, amirite?");
			JOptionPane.showMessageDialog(null, "Anyway, got any lasagna?");
		break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Welp. Good luck!");
		break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Oh");
		break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Oh, same!");
		break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Have a nice weekend!");
		break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "That's nice.");
		break;
		default:
			JOptionPane.showMessageDialog(null, "Wait.");
			JOptionPane.showMessageDialog(null, "That's illegal!");
		break;
		}
	}
}

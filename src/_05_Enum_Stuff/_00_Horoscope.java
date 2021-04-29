package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void scopeOfTheDay(Zodiac sign) {
		switch(sign) {
		
		case ARIES:
			JOptionPane.showMessageDialog(null, "Expect ups and downs in your future. You will see trees today.");
		break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Your freinds will stand by you today, but remember them in their times of need.");
		break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Today is twin day. Hope you got a matching outfit!");
		break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Today is a lucky day for you! Your objectives will be fufilled.");
		break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Today, it is best to stay home. nothing outside will give you what you wish.");
		break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Hope for the best today. It is all you can do until tomorrow.");
		break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You should pursue your passions today, for it is better than ever to do so.");
		break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "nah.");
		break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Your day will be very productive, and you are able to get plenty of work done.");
		break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Your day will be an eventful one, and filled with excitement.");
		break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Everything today will go well for you.");
		break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Fish! Very good. *clap clap* Also, check the obituaries soon. Someone important will die today.");
		break;
		default:
			JOptionPane.showMessageDialog(null, "Are you sure you were born on Earth?");
		break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		
		Zodiac h = Zodiac.GEMINI;
		scopeOfTheDay(h);
	}
}

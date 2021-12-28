package messageDay;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner enterDay = new Scanner(System.in);
		System.out.println("Welcome to the Matrix!");
		System.out.println("Enter a number according to the day of the week: ");
		int num = enterDay.nextInt();
		switch(num) {
		case 1:
			System.out.println("Monday, the day to adopt a new habit, practice your meditation, and get in harmony with the world!");
			break;
		case 2:
			System.out.println("Tuesday, a good day to put your new habit into practice, meditate and start that dream stopped!");
		case 3:
			System.out.println("Wednesday, the day of a morning break, go for a run, feel the fresh air and the beauty outside!!");
		case 4:
			System.out.println("Thursday, day to look around you, see how you can improve the scenario you are in!!");
		case 5:
			System.out.println("Friday, the day to go out with the one you love, go to the movies, the theater, enjoy life!");
		case 6:
			System.out.println("Saturday, a day to dance, listen to music, sing and smile even more!");
		case 7:
			System.out.println("Sunday, your rest day, choose something new and pleasant!");
		}
		

		
		
		
		
		
		
		
		
		
enterDay.close();
	}

}

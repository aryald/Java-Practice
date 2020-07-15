package datatypespractice;

public class SwitchPractice {

	public static void main(String[] args) {
		int a = 70;
		if (a <= 100) {
			System.out.println("Print condition 1");

			if (a < 30) {
				System.out.println("print Condition 2");

			}
		}
		/*
		 * Use the switch statement to select one of many code blocks to be executed
		 */

		int day = 4;
		switch (day) {
		case 1:
			System.out.println("print day Monday");
			break;
		case 2:
			System.out.println("Print Day is Tuesday");
			
		case 3:
			System.out.println("print day is wednesday");
			
		case 4:
			System.out.println("Print day is Thrusday");
			
		case 5:
			System.out.println("Print day is Friday");
		case 6: 
			System.out.println("Print day is Saturday");
			
		case 7:
			System.out.println("print day is Sunday");

			default:
				System.out.println("Print invalid day");
		}

	}

}

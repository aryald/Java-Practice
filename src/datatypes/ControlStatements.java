package datatypes;

public class ControlStatements {

	public static void main(String[] args) {

		int a = 1000, b = 500, c = 10000;

		if ((a > b)|| (a > c)) {// ture ||false = true 
			System.out.println("Print a is big value");//

		} else if (b > c) {
			System.out.println("Print b is big value");
		}

		else {
			System.out.println("C is big value");

		}
	}
}

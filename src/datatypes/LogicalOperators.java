package datatypes;

public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println(20 > 15 && (15 <= 15) || (16 >= 16)); // true
		System.out.println(20 > 15 && (15 <= 15) || (16 > 16)); // true
		System.out.println(20 > 15 && (15 <= 15) && (16 >= 16)); // true
		System.out.println((10 >= 11) && (15 != 1)); // false
		System.out.println(5 >= 10);// false
System.out.println(6!= 6);// false
	}
	

}

package oops;

class amz {

	amz() {
		System.out.println("this is amz constructor");

	}

	amz(int a, int b) {
		System.out.println(a);
		System.out.println(b);

	}

	amz(String name, int age) {
		System.out.println("my name is" + name);
		System.out.println("My age is " + age);

	}
}
public class Cons {
	public static void main(String[] args) {
		amz a = new amz();
		amz b = new amz("Dev ", 28);
		amz c = new amz(10, 20);
		
	}

}

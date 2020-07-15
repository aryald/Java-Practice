package loopingstatements;

public class TestReturn1 {
	int a = 100;

	public static void main(String[] args) {
		TestReturn1 t = new TestReturn1();
		int i = t.m1(10);
		System.out.println("this is local value " + i);
	}
	int m1(int a) {
		// System.out.println("this is my m1 method ");
		return this.a;

	}
}

package loopingstatements;

public class Testreturn {

	Testreturn m1() {
		Testreturn t = new Testreturn();
		System.out.println("this is my test1 Method");
		return t;
	}

	Testreturn m2() {
		System.out.println("this is my test2 Method");
		return this;
	}

	public static void main(String[] args) {
		Testreturn t = new Testreturn();
		Testreturn t1 = t.m1();
		Testreturn t2 = t.m2();

		
	}

}

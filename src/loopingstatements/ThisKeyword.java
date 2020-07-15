package loopingstatements;

public class ThisKeyword {

	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword();
		ThisKeyword t = t1.m1();
		ThisKeyword t3 = t1.m2();

	}

	ThisKeyword m1() {
		ThisKeyword th = new ThisKeyword();
		System.out.println("M1 Method");
		return th;
	}

	ThisKeyword m2() {
		ThisKeyword th1 = new ThisKeyword();
		System.out.println(th1);
		return this;
	}
}

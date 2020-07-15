package oops;

public class OOps1 extends Oops implements Chase {

	public static void main(String[] args) {
		OOps1 o = new OOps1();

		o.peach();
		o.grape();
		o.apple();
		o.orange();
	}

	public void grape() {

		System.out.println("this is the Grape Method ");

	}
	public void peach() {

		int a = 10;
		int b = 20;

		System.out.println(a + b);
	}

	
	public void seattle() {
		
	}

	
	public void portland() {
		
	}
	
	public void renton() {
		int m = 500;
		System.out.println(m);
		
	}

}

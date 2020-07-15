package loopingstatements;

public class ReturnType {

	public static void main(String[] args) {

		ReturnType r = new ReturnType();
		
		int d= r.sum();	
		System.out.println("this is the int D value"+"\t"+d);
	}

	public int sum() {
		int a = 10;
		int b = 30;
		int c = a + b;
		System.out.println(" this is value of c" +"\t"+ c);
		return c;

	}

}

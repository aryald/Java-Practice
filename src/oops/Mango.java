package oops;
class Apple{
	public void one() {
		System.out.println("Hello this is apple method");
	}	
}
class Carret{
	public void two() {
		System.out.println("Hello this is Carret method");
	}
	
}
class Grape{
	public void three() {
		
		System.out.println("Hello this is Grape Method");
	}	
}
public class Mango {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Carret b = new Carret();
		Grape g  = new Grape();		
		a.one();
		b.two();
		g.three();
	}

}

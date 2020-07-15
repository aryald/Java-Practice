package datatypes;

public class RelationalPOperators {

	public static void main(String[] args) {
	
	System.out.println(10>20); //false
	System.out.println( 10==10);// true
	System.out.println(10<20);// true
	System.out.println(10>=20); //false
	System.out.println(10<=20); //true
	System.out.println(10!=10); // false
	
	System.out.println((10==10)|| (20==20));// true||true== true
	System.out.println((10>15)&& (20<15)); //true && false--- flase
	System.out.println((10>15)&& (20<25)); // false&& true--- flase
	System.out.println((10>20)|| (20<20)); // false||false ==false
	    
		

	}

}

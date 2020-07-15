package oops;

class test{// 2 methods
	void m1() {System.out.println("this is the m1 Method");
	}
	void m2() {System.out.println("this is the M2 Metod");
	}	
}
class test1 extends test{// 4 methods
	void m3() {System.out.println("this is the M3 method ");
	}
	void m4() {System.out.println("this is the m4 Method");
	}
}
class test2 extends test1{// 6 methods
	void m5() {System.out.println("this is the M5 method");		
	}
	void m6() {System.out.println("this is the M6 method");		
	}
}
public class Inheratiance1 extends test1{
	public static void main(String[] args) {
  test t = new test();
  t.m1();t.m2();
  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
  test1 t1 = new test1();
  t1.m1();t1.m2();t1.m3();t1.m4();
  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
  test2 t2 = new test2();
  t2.m1();t2.m2();t2.m3();t2.m4();t2.m5();t2.m6();  
  }
}

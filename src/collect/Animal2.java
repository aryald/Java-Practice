package collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Animal2 {

	public static void main(String[] args) {
  Set<String> s = new HashSet<String>();
  s.add("Nepal");
  s.add("India");
  s.add("Usa");
  s.add("Seattle");
  
  Iterator<String> i=  s.iterator();
  Arraylist<String> a = new Arraylist();
  
  while ( i.hasNext()) {
	  System.out.println(i.next());
	  
	  
	  
	  
  }
	
  
  
  
  
	}

}

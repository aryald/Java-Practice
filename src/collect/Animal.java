package collect;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Animal {

	public static void main(String[] args) {
List<String> l= new ArrayList<String>();
l.add("Rama");
l.add("india");
l.add("Nepal");

 System.out.println(l);
 l.add("Usa");
 l.add("Seattle");
 System.out.println(l);
 l.add("Footbal");
 l.add("Sports");
 l.add("USA-USA");
 System.out.println(l);
 Iterator<String> i = l.iterator();
 while (i.hasNext()) {	 
	 System.out.println(i.next());
 } 
 
 
 

 


		
		
	}

}

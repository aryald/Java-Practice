package collect;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("Dave");
		al.add("Aryal");
		al.add(10);
		al.add(null);
		System.out.println(al);
		System.out.println(al.toString());
		al.size();
		al.remove(4);
		System.out.println(al);
		al.set(2, "Anita");
		System.out.println("Printing way in ArrayList");

		for (int n = 0; n < al.size(); n++)
			;
		{

			System.out.println(al.get(n));

		}

		for(String str:al); {
			
			char[] str;
			System.out.println(str);
			
		}
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		

	}

}

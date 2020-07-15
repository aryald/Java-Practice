package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Nepal");
		hm.put(2, "Usa");
		hm.put(3, "Seattle");
		System.out.println(hm.get(2));
		for(Entry m : hm.entrySet()) {
			System.out.println(hm);
			System.out.println(m.getClass() +" "+ m.getValue());
			
		}
	}

}

package loopingstatements;

public class StringPractice {

	public static void main(String[] args) {

		 String name= "hello ";
		 String name1 = "how are you";
		 String name2 = "I am FINne ";
		 
		 System.out.println(name.concat(name2));
		 System.out.println(name.charAt(4));
		 System.out.println(name1.toUpperCase());
		 System.out.println(name2.toLowerCase());
		 System.out.println(name2.equalsIgnoreCase(name1));
		 System.out.println(name1.replaceAll("you", "Usa hello"));
	}

}

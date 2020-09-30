import java.util.ArrayList;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		/*
		 * String s = "Sri dharan"; String s2 = "dharan Sri";
		 * 
		 * int length = s.length(); int indexOf = s.indexOf('a'); int lastIndexOf =
		 * s.lastIndexOf('a'); System.out.println("indexOf : " + indexOf);
		 * System.out.println("lastIndexOf  : " + lastIndexOf);
		 * System.out.println("Length : " + length);
		 * 
		 * System.out.println();
		 * 
		 * String s1 = "Sri will join in Indian army will";
		 * 
		 * // Trim will clear the unwanted space in the front and back String trim =
		 * s1.trim(); System.out.println("Trim : " + trim);
		 * 
		 * // Length will provide the no of char/size of the string int length1 =
		 * s1.length(); System.out.println("Length : " + length1);
		 * 
		 * //To print the particular char of the string char charAt = s1.charAt(15);
		 * System.out.println("CharAt : " + charAt);
		 * 
		 * 
		 * // To print true or false, If -->(s1 = "Sri"--->False)(s1 = ""--->true)
		 * System.out.println(s1.isEmpty());
		 * 
		 * //To convert all the string to lower case
		 * System.out.println("To Lower Case : "+ s1.toLowerCase());
		 * 
		 * //To convert all the string to upper case
		 * System.out.println("To Upper Case : "+ s1.toUpperCase());
		 * 
		 * System.out.println(s2.contains(s));
		 * 
		 */
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();

		l1.add("I||");
		l1.add("will||");
		l1.add("join||");
		l1.add("Indian||");
		l1.add("Railways||");

		for (String x : l1) {

			l2.add(x.replace("||", ""));
		}
		System.out.println(l2);
		
		if (!l2.contains(l2.get(4))) {
			
			System.out.println(l2.get(4));
		}

	}

}

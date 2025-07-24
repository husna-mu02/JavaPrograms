package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set <String> s1 = new HashSet<String>();
		Set <String> s2 = new TreeSet<String>();
		s1.add("Apple");
		s1.add("Orange");
		s1.add("PineApple");
		s1.add("Banana");
		s2.add("Carrot");
		s2.add("Cabbage");
		s2.addAll(s1); //s1 is added to s2 in  unordered manner
		System.out.println(s2);
		
		System.out.println(s2.size());
		System.out.println(s1.isEmpty());
		System.out.println(s2.contains("Carrot"));
		System.out.println(s1.containsAll(s2));
		System.out.println(s2.containsAll(s1));
		
		s1.remove("Apple");
		System.out.println(s1);
		System.out.println(s2);
		
		s2.removeAll(s1);
		System.out.println(s2);
		
		s1.clear();
		System.out.println(s1);
		
	}

}

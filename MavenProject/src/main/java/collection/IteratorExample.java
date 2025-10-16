package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String>();
		s.add("Apple");
		s.add("Mango");
		s.add("Watermelon");
		System.out.println(s);
		Iterator <String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(s);
	}

}

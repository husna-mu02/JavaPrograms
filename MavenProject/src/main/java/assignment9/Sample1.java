package assignment9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String>();
		l.add("White");
		l.add("Yellow");
		l.add("Orange");
		l.add("Red");
		
		System.out.println(l);
		System.out.println();
		
		System.out.println(l.get(1));
		System.out.println();
		
		Iterator <String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		l.remove(2);
		System.out.println();
		
		System.out.println(l);
		System.out.println();
		
		System.out.println(l.contains("Yellow"));
		
	}

}

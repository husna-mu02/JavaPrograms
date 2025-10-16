package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("red");
		l.add("green");
		l.add("yellow");
		l.add("black");
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		l.set(2, "Orange");
		System.out.println(l);
		
		System.out.println(l.size());
		
		System.out.println(l.isEmpty());
		
		l.remove(0); //remove red
		System.out.println(l);
		
		System.out.println(l.contains("pink"));
		System.out.println(l.contains("green"));
		
		l.add("brown");
		l.add("brown");//duplicates brown added twice
		System.out.println(l);
		
		System.out.println(l.indexOf("green"));//prints index of green
		
		System.out.println(l.lastIndexOf("brown"));//prints index of last duplicate value
		
		System.out.println(l);
		
		

	}

}

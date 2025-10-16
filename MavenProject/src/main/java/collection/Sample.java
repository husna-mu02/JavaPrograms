package collection;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		for(String s1 : list) {
			System.out.println(s1);
		}

	}

}

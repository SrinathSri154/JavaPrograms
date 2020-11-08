package stringProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class sorted implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int x = o1.length();
		int y = o2.length();
		
		return x-y;
	}
	
	
	
	
	
}

public class SortingElementsByLength {
	


	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("sat");
		al.add("crinath");
		al.add("zata");
		
		Collections.sort(al, new sorted());
		
		System.out.println(al);
		
		
	}

}

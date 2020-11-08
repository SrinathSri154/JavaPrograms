package stringProgrammes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemovingDuplicates {
	
	public static void duplicates() {
	List list = new ArrayList();
	list.add(1);
	list.add(1);
	list.add(2);
	list.add(3);
	
	System.out.println("before removing duplicates :" + list);

	// 1st method :
	Set<Integer> set = new LinkedHashSet<Integer>(list);
	
	list.clear();
	
	//list.addAll(set);
	
	List<Integer> list1 = new ArrayList<Integer>(set);

	System.out.println("After removing duplicates :" + list1);
	
	}
	

	public static void main(String[] args) {

		duplicates();
		
	}
}

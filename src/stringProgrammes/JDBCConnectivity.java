package stringProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class JDBCConnectivity {
	


	public static void main(String[] args) {

		
//		List list = new ArrayList();
//		list.add(12);
//		list.add(12);
//		list.add(12);
//		list.add(12);
//		list.add(12);
//		 System.out.println(list);
//		 
//		 Set<String> set = new HashSet<>(list);
//		 
//		 System.out.println(set);
//		 list.clear();
//		 
//		 List list1 = new ArrayList(set);
//		 System.out.println(list1);
//		 
		
		
		
//		ArrayList<String> a = new ArrayList<String>(Arrays.asList("JAVA","PYTHon","RUBY"));
//		 
//		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("JAVA","PYTHon","C#"));
//		
//		Collections.sort(a);
//		Collections.sort(a2);
//		
//		System.out.println(a.equals(a2));
//		
//		a2.removeAll(a);
//		System.out.println(a2);
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Srinath");
		map.put("2", "Sai");
		
		// one way of iteration
		Iterator<String> itr =map.keySet().iterator();
		while(itr.hasNext())
		{
			String key =itr.next();
			String value = map.get(key);
			
			System.out.println(key + " " + value);
			
		}
		
		//second way: getting set of pair using entryset
		
		Iterator<Entry<String,String>> entry=map.entrySet().iterator();
		
		while(entry.hasNext())
		{
			
			Entry<String, String> keyvalues = entry.next();
			
			System.out.println("key is : " + keyvalues.getKey() + "Values is :" + keyvalues.getValue());
		}
		
		
	}

}

package stringProgrammes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class hashmap {


	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"srinath");
		map.put(2, "nath");
		map.put(3, "srinath");
		
		//System.out.println(map.get(4));
		
//		 Iterator<Integer> itr = map.keySet().iterator(); 
//		 while(itr.hasNext())
//		 {
//			 Integer key = itr.next();
//			 
//		//System.out.println(key);
//		
//		System.out.println(key + " " +map.get(key));
//		
//		
//		System.out.println("---------------------");
		
		Iterator<Entry<Integer,String>> itr1 =map.entrySet().iterator();
		while(itr1.hasNext())
		{
			Entry<Integer,String> entry =itr1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			//System.out.println(entry);
			
			
		}
			 
		 }
		
		

	}



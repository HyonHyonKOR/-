package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		//Key: String value:Integer
		Map<String, Integer> map = new HashMap<>();
		
		map.put("jack", 85);
		map.put("Adam", 50);
		map.put("Nick", 50);
		map.put("jack", 50);   //"jack" 80 -> 50 
		System.out.println("total Entry:" + map.size());
		System.out.println();
		
		//get value from key
		String key = "jack";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		//get keys from Set and get value from key
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		  while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k +" :" +v);
		  }
		System.out.println();
		
		//get entry from Set and get key and value from iterate
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		  while(entryIterator.hasNext()) {
			    Entry<String, Integer> entry = entryIterator.next();
				String k = entry.getKey();
				Integer v = entry.getValue();
				System.out.println(k +" :" +v);
			  }
		System.out.println();	
		
		
		map.remove("jack");
		System.out.println("total Entry:" + map.size());
		System.out.println();
		
		
		
		}
		
	}

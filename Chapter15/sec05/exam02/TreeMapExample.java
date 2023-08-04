package ch15.sec05.exam02;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple",10);
		treeMap.put("forever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",80);
		treeMap.put("base",20);
		treeMap.put("guess",70);
		treeMap.put("cherry",30);
		
		//get all entries
		Set<Entry<String,Integer>> entrySet  = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();
		
		//get entry from key
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("first word(deepest) :" + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("last word(Highest) :" + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println("before word(previous) :" + entry.getKey() + "-" + entry.getValue());
		entry = treeMap.higherEntry("ever");
		System.out.println("after word(next) :" + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		//Descending
		NavigableMap<String, Integer> decendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = decendingMap.entrySet();
		for(Entry <String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		System.out.println("Research between c & h");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
	}
}

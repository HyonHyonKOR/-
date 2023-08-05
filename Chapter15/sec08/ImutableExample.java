package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImutableExample {
	public static void main(String[] args) {
		
		List<String> immutableList1 = List.of("A","B","C");
		//immutableList1.add("D"); UnsupportedOperationException
		
		Set <String> immutableSet1 = Set.of("A","B","C");
		//immutableSet1.remove("A");
		
		Map<Integer, String> immutableMap1 = Map.of(1,"A",2,"B",3,"C");
 		//immutableMap1.put(4, "D");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutalbeList2 = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		list.add("A");
		list.add("B");
		list.add("C");
		Set<String> immutalbeSet2 = Set.copyOf(set);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer,String> immutalbeMap3 = Map.copyOf(map);
		
		String[] arr = {"A","B","C"};
		List<String> immutableList3 = Arrays.asList(arr);
	}

}

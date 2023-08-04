package ch15.sec02.exam03;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList runtime:",(endTime - startTime));
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList runtime:",(endTime - startTime));
		
		
	}

}

package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		System.out.println("lowest number : " + scores.first());
		System.out.println("highest number : " + scores.last());
		System.out.println("under 95(n<95) : " + scores.lower(95));
		System.out.println("up 95(n>95): " + scores.higher(95));
		System.out.println("under 95(n<=95) : " + scores.floor(95));
		System.out.println("up 85(n>=85) : " + scores.ceiling(85));
		System.out.println();
		
		
		//Descending
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Research
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}
}

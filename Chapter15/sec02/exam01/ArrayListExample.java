package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
	
	List<Board> list = new ArrayList<>();

	list.add(new Board("title1", "content1","author1"));
	list.add(new Board("title2", "content2","author2"));
	list.add(new Board("title3", "content3","author3"));
	list.add(new Board("title4", "content4","author4"));
	list.add(new Board("title5", "content5","author5"));
	
	
	int size = list.size();
	System.out.println("How many object?: " + size);
	System.out.println();
	
	Board board = list.get(2);
	System.out.println(board.getSubject() + "\t" + board.getContent() +"\t" + board.getWritter());
	System.out.println();
	
	for(int i=0; i<list.size(); i++) {
		Board b = list.get(i);
		System.out.println(b.getSubject() + "\t" + b.getContent() +"\t" + b.getWritter());
	}
	System.out.println();
	
	for(Board b: list) {
		System.out.println(b.getSubject() + "\t" + b.getContent() +"\t" + b.getWritter());
	}
	
	}

}

package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

public static void main(String[] args) {
		
	List<Board> list = new Vector<>();
		
	//Worker thread1
	Thread threadA = new Thread() {
	@Override
	public void run() {
		for(int i =1; i<=1000; i++) {
			list.add(new Board("title"+i,"content"+i,"author"+i));
		  }
	    }
	};
		
	//Worker thread2
	Thread threadB = new Thread() {
	@Override
	public void run() {
		for(int i =1001; i<=2000; i++) {
			list.add(new Board("title"+i,"content"+i,"author"+i));
		   }
		 }
	};
		
	
	//Worker thread run
	threadA.start();
	threadB.start();
	
	
	try {
		threadA.join();
		threadB.join();
	} catch (Exception e) {
	}
		
		
	//get size
	int size = list.size();
	System.out.println("total size is " + size );
	System.out.println();
	}

}

package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		
		try(Reader reader = new FileReader("C://tmp/test.txt")){
			
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.print(data + " -> ");
			System.out.println((char)data);
		}
			
		System.out.println();	
			
		
		char[] data = new char[100];
		while(true) {
			int num = reader.read(data);
			System.out.println(data);
			System.out.println(num);
			if(num == -1) break;
			for(int i=0; i<num; i++) {
				System.out.println(data[i]);
			}
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

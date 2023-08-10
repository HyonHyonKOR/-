package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("C://tmp/test2.db")){
		
		byte[] data = new byte[2];
		
		int count = 0;
		while(true) {
			count++;
			int num = is.read(data);  //1) 3をリターン  //4) -1をりたーーん
			if(num == -1) break; //5) break;
		
		for (int i = 0; i<num; i++) {
			System.out.println(data[i]); //2) 3を入れる 
		    }
		  }//3) 1round finish
		 System.out.println(count);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {

	public static void main(String[] args) {

		String originalFileName = "C://tmp/house.jpg";
		String targetFileName = "C://tmp/house2.jpg";
		
	  try(InputStream is = new FileInputStream(originalFileName);
		 OutputStream os = new FileOutputStream(targetFileName)){
		  byte[] data = new byte[1024];
		  
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
			}
		os.flush();
		System.out.println("copy finished");
	    }catch(Exception e) {
	     e.printStackTrace();
	  }
	}
  }


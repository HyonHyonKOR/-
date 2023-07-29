package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringToBytesExample {

	public static void main(String[] args)   {

		String data = "a자바";
		
		
		try {
			//encoding	
			byte[] arr1 = data.getBytes("UTF-8");
			System.out.println(arr1.length);
		    System.out.println(Arrays.toString(arr1));
		    
		    //decoding
		    String data2 = new String(arr1,"UTF-8");
		    System.out.println(data2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	   	    
	}  

}

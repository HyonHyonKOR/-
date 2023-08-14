package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam02/ReadLineExample.java"))){
		
			String str;
			int lineNo = 1;
			while((str = br.readLine()) != null) {
				System.out.println(lineNo++ + "\t" + str);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
}
}

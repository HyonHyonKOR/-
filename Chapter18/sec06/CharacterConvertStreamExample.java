package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		
		write("문자 변환 메소드를 실행합니다.");
		String str = read();
		System.out.println(str);
	}

	public static void write(String str) {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C://tmp/test.txt"),"UTF-8")){
			osw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String read() {
		char[] data = new char[100]; 
		StringBuilder sb = new StringBuilder();
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("C://tmp/test.txt"))){
			int num;
			while((num = isr.read(data)) != -1) {
				sb.append(data,0,num);
			}  
		  }
		 catch (IOException e) {
			e.printStackTrace();
		 }
		return sb.toString();
	  }
   }

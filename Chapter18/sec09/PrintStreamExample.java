package ch18.sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) {
		try(PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/printstream.txt",false))){
			
			ps.print("まるで");
			ps.println("静かな");
			ps.println("恋のような");
			ps.printf("| %6d | %-10s | %-18s |\n" , 1,"홍길동","도적");
			ps.printf("| %6d | %-10s | %-18s |\n" , 2,"김자바","학생");
			ps.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
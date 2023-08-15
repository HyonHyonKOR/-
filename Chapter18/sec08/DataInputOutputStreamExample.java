package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) {
		//DataOutputStream
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/tmp/primitive.db"))){
			
		dos.writeUTF("홍길동");	
		dos.writeDouble(95.5);	
		dos.writeInt(1);	
			
		dos.writeUTF("감자바");	
		dos.writeDouble(90.3);	
		dos.writeInt(2);
		
		dos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}try(DataInputStream dis = new DataInputStream(new FileInputStream("C:/tmp/primitive.db"))){
			for(int i=0; i<2; i++) {
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println(name + ": " + score + ": " + order);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
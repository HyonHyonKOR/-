package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
	public static void main(String[] args) throws IOException {
		
		//FileI/O
		String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1   = "C:/tmp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//BufferedI/O
		String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/tmp/targetFile2.jpg";
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath2));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath2));
		
		//without Buffered
		long nonBufferTime = copy(fis,fos);
		System.out.println("without Buffered:" + nonBufferTime + "ns" );
		
		//use Buffered
		long bufferTime = copy(bis,bos);
		System.out.println("Buffered:\t" + bufferTime + "ns" );
	
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	public static long copy(InputStream is, OutputStream os) throws IOException {
		
		long start = System.nanoTime();
		
		int data;
		while((data = is.read()) != -1 ) {
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		
		return (end-start);
	}
	
}

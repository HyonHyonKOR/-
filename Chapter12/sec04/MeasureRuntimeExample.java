package ch12.sec04;

public class MeasureRuntimeExample {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		 int sum = 0;
		 for(int i=0; i<=1000000; i++) {
			 sum += i;
		 }
		 long time2 = System.currentTimeMillis();
		 
		 System.out.println("sum:" + sum);
		 System.out.println("Runtime(ms):" + (time2-time1));
		 System.out.println("Runtime(sc):" + (time2-time1)/1000.0);
	}

}

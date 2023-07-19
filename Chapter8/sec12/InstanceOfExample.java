package ch08.sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		//2.Vehicleの具象クラスのオブジェクト生成
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//3.ride() メソッド呼び出し時、具象オブジェクトをパラメータにする。
		ride(taxi);
		System.out.println();
		ride(bus);
		
		

	}
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
		  Bus bus  = (Bus) vehicle;  //1.Vehicleにアップキャストされたbusのオブジェクトを元に戻す。
		   bus.checkFare();
		}
		
	}
	
	
}


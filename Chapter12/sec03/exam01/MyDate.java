package ch12.sec03.exam01;

public class MyDate {
	
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day= day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(day == date.day) {
				return true;
			}
		}
		return false;
	}

	
	
}

package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIds = TimeZone.getAvailableIDs();
		for(String id : availableIds) {
			System.out.println(id);
		}		
	}
}

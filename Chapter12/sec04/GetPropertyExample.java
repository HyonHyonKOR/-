package ch12.sec04;

//import java.util.Properties;
//import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		//OS,User Information
		String javaVersion = System.getProperty("java.specification.version"); //yellow letters= key
		String javaHome = System.getProperty("java.home");
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(javaVersion);
		System.out.println(javaHome);
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		System.out.println();
		System.out.println();
		
		
		
		//All Keys and Keys value
		/*System.out.println("--------------------------");
		System.out.println("key:  value");
		System.out.println("--------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey: keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}*/
	}
}
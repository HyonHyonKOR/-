package ch19.sec06;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;


public class CreateJsonExample {
	public static void main(String[] args) throws IOException{
		JSONObject root = new JSONObject();
		
		//JSON objectの属性追加(root is )
		root.put("id", "winter");
		root.put("name", "真冬");
		root.put("age", 25);
		root.put("student", true);
		
		//objectの属性追加(root has tel)
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile","010-123-1234");
		root.put("tel", tel);
		
		//配列を追加
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		root.put("skill", skill);
		
		//JSON
		String json = root.toString();
		
		//print JSON
		System.out.println(json);
		
		
		
		
	}

}

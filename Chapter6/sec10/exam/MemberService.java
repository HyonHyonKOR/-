package ch06.exam;

public class MemberService {

    String id;
    String password;
    boolean result;
	
    
    public boolean login(String id, String password) {
    	 this.id = id;
    	 this.password = password;
    	 
    	 if(this.id.equals("hong")&&this.password.equals("12345")) {
    		 result =true;
    	}
    		 
    	 return result;
    }
    
    public void logout(String id) {
    	System.out.println(id + "님이 로그아웃 되었습니다.");
    }
    
}


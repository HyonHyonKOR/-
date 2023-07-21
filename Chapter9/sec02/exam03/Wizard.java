package ch09.sec02.exam03;

public class Wizard {
	
	private class Fantasy{
		
		public void showFantasyStar(){
			System.out.println("****************");
		}
		
	}
	
	
    String name;
	
	Wizard(String name){
		this.name = name;
		System.out.println("魔法使い "+ name + "を生成しました。");
	}
	
	
	public void showFanatasy() {
	   Fantasy a = new Fantasy();
	   System.out.println("$$$$$$$$$$$$$$$$");
	   a.showFantasyStar();
	   System.out.println("幻覚が消えました。");
	}
	
	
}

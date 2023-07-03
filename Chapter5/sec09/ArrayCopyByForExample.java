package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//長さ３の配列
		int[] oldIntArray = {1,2,3};
		//長さ5の新しい配列を生成
		int[] newIntArray = new int[5];
		//既存の配列の項目をコピー
		for(int i=0; i<oldIntArray.length; i++){
			newIntArray[i]+=oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+",");
		}
	}
}

//result = 1,2,3,0,0
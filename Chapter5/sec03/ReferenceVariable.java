package ch05.sec03;

public class ReferenceVariable {
	public static void main(String[] args) {
		int[] arr1;  //配列変数arr1を宣言; (stack) ー＞ arr1
		int[] arr2;  //配列変数arr2を宣言; (stack) ー＞ arr2
		int[] arr3;  //配列変数arr3を宣言; (stack) ー＞ arr3
		
		arr1 = new int[] {1,2,3};   //配列 {1,2,3}をヒープ領域に生成し, その配列のあろレスをスタック猟奇のarr1変数に代入 (仮想のアドレス:aaaaaaaaa)
		arr2 = new int[] {1,2,3};   //配列 {1,2,3}をヒープ領域に生成し, その配列のあろレスをスタック猟奇のarr２変数に代入 (仮想のアドレス:bbbbbbbbb)
		arr3 = arr2;                //arr3にarr2のスタック旅域の値、つまりアドレス(bbbbbbbb)を代入
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2));  //arr1: aaaaaaaaa arr2:bbbbbbbb -> false
		System.out.println("arr2 == arr3: "  + (arr2 == arr3));  //arr2,arr3= bbbbbbbb;
		
		//참조형 변수에서의 비교연산자는 변수가 서로 같은 주소값을 갖고 있는지, 즉 같은 객체를 참조하고 있는지를 판별한다.
		//参照型の変数での比較演算子は変数が同じアドレスを持っているか、つまり同じオブジェクトを参照しているかを比較する。
	}
}
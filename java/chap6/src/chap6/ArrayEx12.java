package chap6;
/*
 * 배열의  복사: for구문을 이용하여 배열 복사하기.
 * 
 * 한번 생성된 배열 객체는 크기 변경이 안됨 => collection 의 List 객체는 변경 가능.
 * */
public class ArrayEx12 {

	public static void main(String[] args) {
		int score1[]= {90,80,70};
		//score1.length=5; //error. 배열의 크기 변경이안됨.
		int score2[]=new int[5];
		for(int i=0; i<score1.length;i++) {
			score2[i]=score1[i];
		}
		for(int s:score2) {
			System.out.println(s);
		}
	}
}

package chap5;
/*
 * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 3
 * 	 *
 *  **
 * ***
 * 
 * */
import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();	
		
		for(int i=len; i>=1 ;i--) {
			for(int j=1; j<=len ;j++) {	
				if(i>j) {
					System.out.print(" ");		
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}




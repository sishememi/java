package chap5;

import java.util.Scanner;

/*
 * ���� ���ϱ�
 * 	1. �⵵��  4�ǹ���� ���
 * 		400��  ��� :����
 * 		100��  ��� :���
 * 		100��  ����� �ƴ� ���: ����
 * 	2. �⵵��  4�� ����� �ƴѰ�� : ���
 * [���]
 * �⵵�� �Է��ϼ���
 * 2019
 * ����Դϴ�.
 * 2004
 * �����Դϴ�.
 * */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%4==0) 
		{
			if(year%400==0){				
				System.out.println("�����Դϴ�.");
			}else if(year%100==0) {								
					System.out.println("����Դϴ�.");
			}else if(year%100!=0) {
				System.out.println("�����Դϴ�.");
			}
			
		}else{
			System.out.println("����Դϴ�.");
		}
		
		
		if(year % 4 ==0) {
			if(year % 100 ==0 && year % 400 !=0) {
				System.out.println("����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
			}
			
		}else {
			System.out.println("����Դϴ�.");
		}
	}	
}

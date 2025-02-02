package chep4;
/*
 * shift 연산자: 비트이동 연산자 ,연산자중에서 성능이 가장 좋음.
 * 
 * << n: 왼쪽으로 n비트만큼 이동. 오른쪽의 n비트 0으로 채움
 * >> n: 오른쪽으로 n비트만큼 이동. 왼쪽의 n비트를 부호비트로 채움.
 *>>> n: 오른쪽으로 n비트만큼 이동. 왼쪽의 n비트 0으로 채움. 
 *
 * */
public class OpEx8 {

	public static void main(String[] args) {
		
		System.out.println("8 << 2:" + (8 << 2));	
		/*
		 * 8:   00001000
		 * <<2: 00100000 : 32
		 * */
		System.out.println("8 >> 2:" + (8 >> 2));
		/*
		 * 8    :00001000
		 * >>2	:00000010 :2
		 * */
		System.out.println("8 >>> 2:" + (8 >>> 2));
		/*
		 * 8    :00001000
		 * >>>2	:00000010 :2
		 * */
		System.out.println("-8 <<2:" + (-8 << 2));
		/*
		 * -8   : 11110000
		 * <<2  : 11000000  :-32 
		 * */		
		System.out.println("-8 >> 2:" + (-8 >> 2));
		/*
		 * -8   : 11110000
		 *>> 2  : 11111110  :-2 
		 * */	
		System.out.println("-8 >>> 2:" + (-8 >>> 2));
		/*
		 * -8   : 11110000
		 *>>> 2 : 00111110  
		 * */	
	}

}

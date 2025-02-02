package chap19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//.sorted(Comparator.reverseOrder()) 역순
public class ProductFilesStreamEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
	      // 월별 판매 수량을 Map 객체로 생성하기
	      List<Car> list = br.lines().map(s -> // s : 1(월),2(판매상태),아반테(차종), 3(판매수량), (반품사유<- 없을 수도 있음) => 문자열
	      {
	         String[] str = s.split(",");
	         String temp = "";
	         try
	         {
		            temp = str[4]; // 반품사유
	         }
	         catch(ArrayIndexOutOfBoundsException e)
	         {
	            temp = "";
	         }
	         return new Car(Integer.parseInt(str[0]),
	                  Integer.parseInt(str[1]), str[2],
	                  Integer.parseInt(str[3]), temp);
	      }).collect(Collectors.toList()).sort(new Comparator<car>{
	    	  @Override
	    	  public int compare(Car c1, car c2){
	    		  return c1.getMonth()-c2;.
	    	  }
	      });
//	      System.out.println(list);
	      System.out.println(list.size());
	      for(int i=0;i<10; i++) {
	    	  System.out.println(list.get(i));
	      }
	}
}

package chap19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

class Car{
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	//getter
	public int getMonth() {
		return month;
	}
	public int getCon() {
		return con;
	}
	public String getCar() {
		return car;
	}
	public int getQty() {
		return qty;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return "Car month=" + month + ", con=" + con + ", car=" + car + ", qty=" + qty + ", remark=" + remark ;
	}
	
}
public class ProductFilesStreamEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		//월별 판매 수량을 Map객체로 생성하기.
		Map<Integer,Long> map = br.lines()
				.map(s->{ //문자열  s: 1,2,아반테,3,(반품조건) 이런 형태
					String[] str = s.split(",");//","로 구분
					String temp = "";
				try {
					temp = str[4]; //반품사유
			}catch(ArrayIndexOutOfBoundsException e) {
				temp= "";
			}
			return new Car(Integer.parseInt(str[0]), //월
					Integer.parseInt(str[1]),str[2], //상태,자동차이름
					Integer.parseInt(str[3]),temp);  //수량,temp=반품사유 / 여기까지 스트링 문자
		}).filter(s->s.getCon() ==2) //판매.
				.collect(Collectors.groupingBy(Car::getMonth, //=> 월별로 카운트? Key 값 = 월 
						Collectors.summingLong(Car::getQty)));//Collectors.summingLong(Car::getQty) : 수량의 합
		System.out.println(map);
		
		//자동차별 반품 수량을 Map객체로 생성하기
		br = new BufferedReader(new FileReader("product.txt")); //다시 읽어줌
		Map<String, Long> map2 = br.lines()
				.map(s->{
					String [] str = s.split(",");
					String temp = "";
				try {
					temp = str[4]; //반품 사유
				}catch(ArrayIndexOutOfBoundsException e) {
					temp= "";
				}
			return new Car(Integer.parseInt(str[0]), 
					Integer.parseInt(str[1]),str[2], 
					Integer.parseInt(str[3]),temp);
		}).filter(s->s.getCon() == 3 ) //반품
				.collect(Collectors.groupingBy(Car::getCar, //=>Key ,자동차이름
				Collectors.summingLong(Car::getQty)));
		System.out.println(map2);
	}
}

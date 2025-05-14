package com.javaex.ex03;

public class MyApp {
	public static void main(String[] args) {
		//*포인트 포인별로 관리. 원은 원별로 관리
		
		/////포인트관리//////////////
		///포인트리스트
		MyList<Point> pList = new MyList<Point>(); //Object --> Point전용으로
		
		
		//포인트 
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//포인트리스트에 포인트(주소)를 넣는다
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		//출력
		for(int i=0; i<pList.size();i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		/////원 관리/////////////////////////////
		
		///원리스트
		MyList<Circle> cList = new MyList<Circle>();
		
		//원
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(20);
		Circle c03 = new Circle(30);
		
		//원리스트에 주소를 넣는다
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		//출력
		for(int i=0; i<cList.size();i++) {
			System.out.println(cList.get(i).toString());
			//업캐스팅 되지 않았다
		}
		
		//다운캐스팅 하지 않아도 된다
		cList.get(0).getRadius();
		
		
		
		
	}
}

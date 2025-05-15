package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {
	
	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		//포인트
		 Point p01 = new Point(2,2);
		 Point p02 = new Point(3,3);
		 Point p03 = new Point(4,4);
				 
				 
		 pList.add(p01);
		 pList.add(p02);
		 pList.add(p03);
		 
		 Point p = pList.get(0);
		 System.out.println(p.toString());
		 
		 for(int i=0;i<pList.size();i++) {
			 System.out.println(pList.get(i).toString());
		 }
		 
		 System.out.println(pList.toString());
		 
		 System.out.println("------------------------------------");
		 
		 
		 ArrayList<Circle> cList = new ArrayList<Circle>();
		 
		 Circle c01 = new Circle(10);
		 Circle c02 = new Circle(20);
		 Circle c03 = new Circle(30);
		 
		 cList.add(c01);
		 cList.add(c02);
		 cList.add(c03);
		 
		 Circle c = cList.get(0);
		 System.out.println(c.toString());
		 
		 for(int i=0;i<cList.size();i++) {
			 System.out.println(cList.get(i).toString());
		 } 
		 
		 System.out.println("-----------------------------------");
		 
		 cList.remove(1);     //1번방을 지워라
		 for(int i=0 ; i<cList.size();i++) {
			 System.out.println(cList.get(i).toString());
		 }
		 
		 System.out.println("-----------------------------------");
		 
		 System.out.println(cList.toString());
			 
		
		 
	}
	
}

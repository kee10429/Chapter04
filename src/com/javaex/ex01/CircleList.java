package com.javaex.ex01;

public class CircleList {
	
	
	//필드
	private Circle[] cArray;
	private int crtpos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtpos = 0;
	}
	
	//메소드gs
	
	//메소드일반
	public void add(Circle c) {
		this.cArray[crtpos] = c;
		this.crtpos++;
	}
	
	public Circle get(int i) {
		return cArray[i];
	}
	
	public int size() {
		return crtpos;
	}
	
	
}

package com.javaex.ex02;

public class ObjList {
	
	//필드
	

	//필드
	private Object[] oArray; // 배열을 담는 주소만 생김
	private int crtPos; // 현재 포지션값 예시
	
	//생성자
	public ObjList() {
		oArray = new Object[3];
		crtPos = 0; // 초기값 0으로 세팅 --> 0번째방
	}

	//메소드 getter setter --> 필요없어서 안만듬
	
	//메소드 일반
	
	public void add(Object r) {
		oArray[crtPos] = r;
		crtPos++; //증감식
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}


}

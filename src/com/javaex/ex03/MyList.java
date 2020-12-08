package com.javaex.ex03;

public class MyList<T> { //<T> -- >무엇이 담길수 있다
	

	//필드
	private T[] oArray; // 배열을 담는 주소만 생김
	private int crtPos; // 현재 포지션값 예시
	
	//생성자
	public MyList() {
		oArray = (T[])(new Object[3]);
		crtPos = 0; // 초기값 0으로 세팅 --> 0번째방
	}

	//메소드 getter setter --> 필요없어서 안만듬
	
	//메소드 일반
	
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++; //증감식
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}

	
	

}

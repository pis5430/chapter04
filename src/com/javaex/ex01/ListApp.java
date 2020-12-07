package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		
		//사각형은 사각형대로 
		//원은 원대로
		//삼각형은 삼각형대로
		
		RectList rList = new RectList();
		
		Rectangle r01 = new Rectangle(3,9);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		Rectangle r100 = rList.get(0);
		r100.draw();
		
		System.out.println(rList.size());
		
		
		
	}

}

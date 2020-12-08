package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListApp {

	public static void main(String[] args) {
		//이미 잇는 리스트를 가져다 쓰기
		//ArrayList사용 -- >new ArrayList<자료형>
		//ctrl + shuft + o --> import 필요한것 다 불러옴
		//ArrayList 사용 + Rectangle
		
		//ArrayList<Rectangle> rList = new ArrayList<Rectangle>();		
		LinkedList<Rectangle> rList = new LinkedList<Rectangle>();
		
		
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(3,3);
		
		
		//add()
		rList.add(r01);
		rList.add(r02);
		
		
		//get()
		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());
		
		
		//size()
		System.out.println(rList.size());
		
		
		Rectangle r03 = new Rectangle(100,100);
		//위치지정 추가
		rList.add(0,r03);
		
		System.out.println("=======================");
		
		//삭제 remove()
		//rList.remove(0);
		rList.remove(0);
		
		
		//전체출력 --> get(), size를 이용해서 구현
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("=======================");
		rList.remove(r02);
		//전체출력 --> get(), size를 이용해서 구현
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		
		///////////////////////////원
		System.out.println("===========원관리============");
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);	
		
		cList.add(c01);
		cList.add(c02);
		// cList.add(r01); 사각형 사용 x --> 제네릭을 사용한 대표적인 ArrayList
		
		for(int i=0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		
		
		
	}

}

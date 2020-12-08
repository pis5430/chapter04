package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		//범용으로 만든 objList를 사용하는데
		//메모리에 올릴때 (new)
		//사각형 전용으로 만들어버린다.
		
		MyList<Rectangle> rList = new MyList<Rectangle>(); // MyList<T>가변환
		
		Rectangle r01 = new Rectangle(5,5);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size(); i++) {
			((Rectangle)(rList.get(i))).draw();
		}
		
		
		//범용으로 만든 objList를 사용하는데
		//메모리에 올릴때 (new)
		//원형 전용으로 만들어버린다.
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
		
		
		//범용으로 만든 objList를 사용하는데
		//메모리에 올릴때 (new)
		//삼각형 전용으로 만들어버린다.
		
		MyList<Triangle> tList = new MyList<Triangle>();
		
		Triangle t01 = new Triangle(5,10);
		Triangle t02 = new Triangle(10,15);
		
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			((Triangle)(tList.get(i))).draw();
		}

	}

}

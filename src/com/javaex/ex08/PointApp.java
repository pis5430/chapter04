package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		//HashMap 사용하기
		
		// 키-값 , 보통은 폭넓게 String 자료형으로 잡음
		Map<String,Point> pMap = new HashMap<String,Point>();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		Point p04 = new Point(4,4);
		
		pMap.put("박명수", p01); // 박명수 --> 키값
		pMap.put("유재석", p02);
		pMap.put("정준하", p03);
		pMap.put("이효리", p04);
		
		System.out.println(pMap.toString());
		System.out.println(pMap.get("유재석").getX());
		System.out.println(pMap.get("박명수").getY());
		
		
		//키값 중복시
		
		Point p05 = new Point(5,5);
		pMap.put("박명수",p05); // 같은 키값위에 덮어버림
		
		System.out.println(pMap.toString());
		
		//Map에서 key값은 Set으로 관리되고 있다.
		Set<String> keys = pMap.keySet();
		for(String key : keys) { //x값만 나열
			System.out.println(pMap.get(key).getX());
		}
		
		

	}

}

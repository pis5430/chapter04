package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {

	public static void main(String[] args) {
		
		//미니로또 만들어보기 --> 중복체크 포함
		//HachSet을 이용하기
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		iSet.add((int)(Math.random()*45)+1);
		iSet.add((int)(Math.random()*45)+1);
		iSet.add((int)(Math.random()*45)+1);
		iSet.add((int)(Math.random()*45)+1);
		iSet.add((int)(Math.random()*45)+1);
		iSet.add((int)(Math.random()*45)+1);
		
			for(Integer j : iSet) {
				System.out.print(j + " ");	
			}

		
		
		

	}

}

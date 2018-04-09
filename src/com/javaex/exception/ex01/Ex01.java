package com.javaex.exception.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		/******num값에 0을 넣었을 때 오류 발생. => 예외처리 (변수를 밖으로 빼야 함)*******/
		try {
		result = 100/num;  //예외가 발생할 가능성이 있는 실행문
		}catch(ArithmeticException e) {  //수학 예외처리문
			System.out.println(e);  
		}finally {
			System.out.println("finally 영역");
		}
		
		//정상적인 경우 try -> finally, 비정상적인 경우 try -> catch -> finally 순서로 처리
		
		
		//System.out.println(result);
		sc.close();

	}

}

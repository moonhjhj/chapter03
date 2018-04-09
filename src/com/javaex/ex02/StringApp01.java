package com.javaex.ex02;

public class StringApp01 {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1 == s2);//주소값이 같은지 비교
		
		s1 = "hello!";
		System.out.println(s1 == s2);//s1의 주소가 바뀜
				
				

	}

}

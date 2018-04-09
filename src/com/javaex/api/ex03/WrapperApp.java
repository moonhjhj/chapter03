package com.javaex.api.ex03;

public class WrapperApp {

	public static void main(String[] args) {

		/****** 원칙적으로 Integer 선언할 때 *******/

		Integer i = new Integer(10);
		Short s = new Short((short) 3); // short는 이렇게...?
		Byte b = new Byte((byte) 3); // byte도 이렇게... byte 빼면 값 안들어감

		Integer result = new Integer(10) + new Integer(3);
		System.out.println(result);
		
		/******** boxing(비원칙적) ********/
		Integer i01 = 10;
		
		/*******parseInt : 문자를 숫자로 바꿔줌(문자열을 정수로) ==> int에 넣어줘야 함. *******/
		int r02 = i01.parseInt("1234"); //i01은 인스턴스
		System.out.println(r02);
		
		/*******숫자를 문자로 바꿈(정수를 문자열로)*********/
		String str = String.valueOf(555); //String.valueOf 의 String은 인스턴스가 아니라 클래스..? static일 가능성이 높음
		System.out.println(str);
		
		String str2 = "" +666;//숫자에 아무것도 없는 문자열 더해도 같은 효과. 문자열 + 정수 = 문자열. 이걸 더 많이 씀
		System.out.println(str2);
		
		
		String s04 = "hi";
		String inputText = "hi";
		if(inputText.equals(s04)){  //inputText부분에 실제 문자열을 씀.
			//if("hi".equals(s04)){}
		}
		
		

		

		/***** unboxing ******/
		//int r01 = i01;  //주소를 integer에 넣는다??? => 주소 안의 값을 꺼내서 int에 넣어줌

	}

}

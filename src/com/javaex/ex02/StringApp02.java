package com.javaex.ex02;

public class StringApp02 {

	public static void main(String[] args) {

		String a = new String(" abcd"); // string의 생성자에 넣는거
		String b = new String(", efg ");

		a = a.concat(b);
		System.out.println(a);
		/***** trim : 앞뒤 공백 제거 ******/
		a = a.trim();
		System.out.println("--" + a + "--");

		/*** replace : 문자열 바꾸기 ****/
		a = a.replace("ab", "12");
		System.out.println(a);

		System.out.println("====================");

		/*** split : 콤마를 기준으로 나누기 ****/
		String[] s = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		/**** substring : 3번째부터 출력 ****/
		String str = "Hello java!";
		String r01 = str.substring(3);
		System.out.println(r01);

	}

}

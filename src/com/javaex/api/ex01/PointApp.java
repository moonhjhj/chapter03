package com.javaex.api.ex01;

public class PointApp {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		/*System.out.println(a == b); //(내부적인) 주소가 같은지 출력 (내부 주소 : 우리가 주소 출력하는 값과 또 다름)
		System.out.println(a == c);
		*/

		/*System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);// toString이랑 결과값 같음.
*/
	}

}

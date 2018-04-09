package com.javaex.exception.ex02;

import java.io.IOException;

public class ThrowExep {
	/********(2)처리안하고 바깥으로 던져버림********/
	public void executeExcept() throws IOException{
		
		System.out.println("강제예외발생");
		throw new IOException();
	}
/***********(1)여기서 직접 처리*************/
	/*public void executeExcept() {
		
		
		try {
			System.out.println("강제예외발생");
			throw new IOException();
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");

		}

	}
*/
}

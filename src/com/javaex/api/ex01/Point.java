package com.javaex.api.ex01;

public class Point {
	
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	public boolean equals(Point p) {
		if(x == p.x &&  y == p.y) { //위의 this.x랑 밖에서 던져준 p.x가 같으면
			return true;
			
		}else {
			return false;
		}
	}
	

}

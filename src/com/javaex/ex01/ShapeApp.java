package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape("빨강");		추상화시킨것은 출력못함
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		((Ractangle)sr1).draw();
		//sr1의 가로크기 출력
		System.out.println(((Ractangle)sr1).getWidth());
		
		
	}
}

	
	
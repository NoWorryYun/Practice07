package com.javaex.ex02;

public class Sparrow extends Bird {

	//필드
	
	
	
	//생성자
	public Sparrow() {}
	public Sparrow(String name) {
		super(name);
	}
	
	
	//GS
	
	
	
	//일반
	public void sing() {
    	System.out.println("참새("+super.getName()+")가 날지 않습니다.");
    }

    public void fly() {
    	System.out.println("참새("+super.getName()+")가 소리내어 웁니다.");
    }
    
    public void showName() {
    	System.out.println("참새의 이름은 "+super.getName()+" 입니다.");
    }

}

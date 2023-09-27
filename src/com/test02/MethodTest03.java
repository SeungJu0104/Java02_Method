package com.test02;

import com.test01.MethodTest01;
//[상속]
//자식 클래스명 extends 부모클래스명
//자바에서는 하나의 클래스만 상속 가능하다.
public class MethodTest03 /*extends MethodTest01*/ {

	public static void main(String[] args) {
		//static 메소드 호출(실행) : 클래스명.메소드명(); 또는 메소드명();
		MethodTest01.publicMethod();//public (+) 어디서나 접근 가능
		//MethodTest01.protectedMethod();//상속 없으면 에러 발생. protected (#) 상속 관계 또는 같은 패키지 내에서 접근 가능
		//MethodTest01.defaultMethod();//에러 발생. default 같은 패키지 내에서 접근 가능. 상속과 무관계.
		//MethodTest01.privateMethod();//에러 발생. private (-) 현재 클래스에서만 접근 가능
		
		//non static method 호출(실행)
		//클래스명 변수명 = new 클래스명();
		//변수명.메소드명();
		MethodTest01 mt01 = new MethodTest01();
		mt01.nonStaticMethod();
	}
	
	
}

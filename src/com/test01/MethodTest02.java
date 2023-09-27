package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//static 메소드 호출(실행) : 클래스명.메소드명(); 또는 메소드명();
		MethodTest01.publicMethod();//public (+) 어디서나 접근 가능
		MethodTest01.protectedMethod();//protected (#) 상속 관계 또는 같은 패키지
		MethodTest01.defaultMethod();//default 같은 패키지
		//MethodTest01.privateMethod();//에러 발생. private (-)는 현재 클래스에서만 접근 가능하기 때문이다.

	}

}

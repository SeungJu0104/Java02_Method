package com.test01;

public class MethodTest01 {
	
	

	public static void main(String[] args) {
		//static method 호출(실행)
		//클래스명.메소드명(); 또는 메소드명();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		defaultMethod();
		privateMethod();
		
		//non static method 호출(실행)
		//클래스명 변수명 = new 클래스명();
		//변수명.메소드명();
		
	}
	//[접근제한자]
	//public : 어디서나 접근 가능,참조 가능 (+)
	//protected : 상속일 경우 상속된 곳에서, 상속이 아닌 경우 같은 패키지 안에서만 접근 가능 (#)
	//default : 같은 패키지 안에서만 접근 가능 (앞에 예약어 자체가 붙지 않는다.)
	//private : 현재 클래스 내에서만 접근 가능 (-)
	public static void publicMethod() {
		System.out.println("Public method");
	}

	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	public void nonStaticMethod() {
		System.out.println("non static method");
	}
	
}

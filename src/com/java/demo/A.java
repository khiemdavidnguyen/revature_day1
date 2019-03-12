package com.java.demo;


public class A {
	
	public static void main(String[] args) {
		C obj = new C();
		obj.print();
	}

}
class B {
	int x=5;
	void print() {
	System.out.println(x);
	}
}
class C extends B {
	int x = 6;
	void print() {
		super.print();
		System.out.println(x);
	}
}




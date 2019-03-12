package com.java.demo;

public class DemoOne {
	
	public static void main(String[] args) {
		System.out.println("Hello!");
	}
	
	byte x=126; //8 bits
	short y=4643; //16 bits
	//implicit explicit 
	
	y=x; //implicit > larger or widening
	// x=y; problem
	x=(byte)y; //explicit  > smaller or narrowing 
	//byte short int long float double
	//8 16 32 64 32 64
	
	//ternary operator
	int x=5;
	int y = x>10? x: 10;
	
	//Array: collection of elements of same data type
	float scienceMarks =32.5f;
	float mathMarks =95f;
	float historyMarks = 23f;
	float[] marks= {32.5f, 95f, 23f};
	
	/*switch will have cases, include "break" after each case and 
	also a "default" if no cases match */
	//only int char strings enum allowed 
	
	/*
	 method: modifiers return_type name ( args...data_type name){}
	 */
}
	/*
	 int findFactorial( int number ){
	 int result;
	 for(int temp= number; temp>=1; temp--){
	 result= result*temp;
	 }
	 }
	 return result;
	 
	 */



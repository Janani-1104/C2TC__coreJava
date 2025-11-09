package com.tnsif.dayseven.overriding;

public class override {

	public int add(int a,int b) {
		return a+b;
		}
}
class sub extends override{
	public  int add(int a,int b) {
		System.out.println("Addition Program");
		return a-b;
	}
}
class check extends sub{
	public int add(int a,int b) {
		return a*b;
	}
}

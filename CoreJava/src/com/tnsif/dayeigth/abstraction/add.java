package com.tnsif.dayeigth.abstraction;

abstract  class add {
	int a;
	int b;
	abstract void sub(int a,int b);
	add(int a,int b) {
		System.out.println("Addition is: "+(a+b));
	}
}

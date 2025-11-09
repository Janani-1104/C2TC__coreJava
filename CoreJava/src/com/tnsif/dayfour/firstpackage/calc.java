package com.tnsif.dayfour.firstpackage;

public class calc {
	public int add(int a,int b) {
		return a+b;
	}
	private int sub(int a,int b) {
		return a-b;
	}
	protected void mul(int a,int b) {
		System.out.println(a*b);
	}
	int div(int a,int b) {
		return a/b;
	}
	public void showPrivate() {
        System.out.println("Private sub (10-5): " + sub(10, 5));
    }

}

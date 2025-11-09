package com.tnsif.dayfour.secondpackage;
import com.tnsif.dayfour.firstpackage.*;

public class advance extends calc {
	public void display() {
		System.out.println("This is protected");
		mul(10, 5);
		System.out.println("Add result: " + add(10, 5));
	}
	

}

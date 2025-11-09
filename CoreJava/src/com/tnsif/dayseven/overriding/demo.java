package com.tnsif.dayseven.overriding;

public class demo {

	public static void main(String[] args) {
		override s1=new sub();
		System.out.println(s1.add(8,3));
		s1=new check();
		System.out.println(s1.add(8,3));

	}

}

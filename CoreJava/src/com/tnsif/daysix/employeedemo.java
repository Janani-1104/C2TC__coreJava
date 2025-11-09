package com.tnsif.daysix;


public class employeedemo {

	public static void main(String[] args) {
		employee e1=new employee("Hema",21);
		employee e2=new employee("Hema",21);
		e1.show();
		e2.show();
		System.out.println(e1.companyname);
		System.out.println(e2.companyname);
		employee.companyname="Accenture";
		System.out.println(e1.companyname);
		System.out.println(e2.companyname);

		
		
	}

}

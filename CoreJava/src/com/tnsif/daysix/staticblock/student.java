package com.tnsif.daysix.staticblock;

public class student {
	int ID;
	String name;
	static String companyname;
	student(int ID,String name){
		this.ID=ID;
		this.name=name;
	}
	static{
		companyname="TNSIF";
		System.out.println("Company name is Tnsif");
	}
	void display() {
		System.out.println("ID:" + ID + "name:" + name + companyname);
	}


}

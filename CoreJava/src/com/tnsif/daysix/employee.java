package com.tnsif.daysix;

public class employee {
	int ID;
	String name;
	static String companyname="TNSIF";
	employee(String name,int ID){
		this.name=name;
		this.ID=ID;
	}
    void show() {
		System.out.println("name:" + name + "ID:" + ID + companyname);
	}
	
}

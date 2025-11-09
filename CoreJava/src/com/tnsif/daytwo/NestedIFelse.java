package com.tnsif.daytwo;

public class NestedIFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;

        if (age >= 18) {
            System.out.println("Adult");
            if (age >= 60) {
                System.out.println("Senior Citizen");
            } else {
                System.out.println("Young Adult");
            }
        } else {
            System.out.println("Minor");
        }

	}

}

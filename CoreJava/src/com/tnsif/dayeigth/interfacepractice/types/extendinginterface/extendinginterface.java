package com.tnsif.dayeigth.interfacepractice.types.extendinginterface;

public class extendinginterface implements childinterface{

		public void greet() { 
			System.out.println("print method");
		}
		public void show() {
			System.out.println("show Method");
		}
		public static void main(String[] args) {
	        extendinginterface obj = new extendinginterface();
	        obj.show();   // prints "show Method"
	        obj.greet();  // prints "print method"
	    }


}

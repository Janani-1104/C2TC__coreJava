package com.tnsif.daysix.finalvar;

class usingmethod {
	    final void show() {
	        System.out.println("This method cannot be overridden");
	    }
	}

class Child extends usingmethod {
	     void show() { } // ❌ Error! Can't override final method
	}
}
package com.tnsif.daysix.finalvar;

final class usingclass {
    final void show() {
        System.out.println("This method cannot be overridden");
    }
}

class Child extends usingclass {
    void show() { } // ❌ Error! Can't override final method
}


	
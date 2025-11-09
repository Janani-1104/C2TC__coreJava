package com.tnsif.dayfive.singleinheritance;


class A {
    public void Aalpha() {
        System.out.println("A is alphabet");
    }
}


class B extends A {

   
    public B() {
        System.out.println("In B constructor");
    }

    
    public B(int n) {
        this();                
        System.out.println("B is alphabet, n = " + n);
    }
}

// Main class
public class single {
    public static void main(String[] args) {
        B obj = new B(5); 
    }
}

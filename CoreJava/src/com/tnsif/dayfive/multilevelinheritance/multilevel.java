package com.tnsif.dayfive.multilevelinheritance;

public class multilevel {
    public static void main(String[] args) {
        dog myDog = new dog();

       
        System.out.println("Type: " + myDog.type);           
        System.out.println("Breed: " + myDog.breed);      
      
        myDog.eat();     
        myDog.sleep();   
        myDog.bark();    
    }
}

package com.tnsif.dayfive.hierarchicalinheritance;

public class hierarchical {
    public static void main(String[] args) {
        dog myDog = new dog();
        cat myCat = new cat();

       
        System.out.println("Dog Type: " + myDog.type);
        System.out.println("Dog Breed: " + myDog.breed);
        myDog.eat();
        myDog.bark();

        System.out.println();

       
        System.out.println("Cat Type: " + myCat.type);
        System.out.println("Cat Breed: " + myCat.breed);
        myCat.sleep();
        myCat.meow();
    }
}

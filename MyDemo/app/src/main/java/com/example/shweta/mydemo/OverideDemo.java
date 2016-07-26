package com.example.shweta.mydemo;

/**
 * Created by shweta on 26/7/16.
 */
//Case 1:

class OverideDemo {
    public void run(){
        System.out.println("Overriding "+"Vehical is running");
    }
}

class Bike2 extends OverideDemo{
    public void run(){
        System.out.println("Overriding "+"Bike is running");
    }

}

//Case 2: Using Super with variable
class OverideDemoSuper {
    int speed =100;

}

class Bike3 extends OverideDemoSuper{
    int speed=50;
    void display(){
        System.out.println("Demo Super"+super.speed);
    }
}

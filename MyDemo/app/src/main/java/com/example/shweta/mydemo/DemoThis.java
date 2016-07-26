package com.example.shweta.mydemo;

/**
 * Created by shweta on 26/7/16.
 */

public class DemoThis {
    int id;
    String name;
    String lastName;
//    Without Using this
    DemoThis(int id ,String name){
        id=id;
        name=name;
    }
    public void display(){
        System.out.println("Demo Without This "+id +" "+name);
    }

//    With using this
    DemoThis(int id,String name,String lastName){
        this.id=id;
        this.name=name;

        this.lastName=lastName;

    }
    public void show(){
        System.out.println("Demo With this " +id+name+lastName);
    }
}

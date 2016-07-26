package com.example.shweta.mydemo;

/**
 * Created by shweta on 26/7/16.
 */

public class DemoConstructor
{

    int age;
    String name;
    DemoConstructor(){
        System.out.println("Default Constructor"+age+" "+name);
    }
    DemoConstructor(int age,String name){
        age=age;
        name=name;
    }
    public void display(){
        System.out.println("Parameter Constructor"+age+" "+name);
    }
}

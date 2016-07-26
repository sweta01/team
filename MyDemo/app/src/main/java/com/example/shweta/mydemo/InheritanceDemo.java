package com.example.shweta.mydemo;

/**
 * Created by shweta on 26/7/16.
 */
class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
 class InheritanceDemo extends Employee{
    public int bonus=1000;
    public int id;
    public String name;
    Address address;
    public InheritanceDemo(){

    }
    public InheritanceDemo(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
   void displayAggeration(){
       System.out.println("Demo Aggregation "+id+name+address.city+address.state+address.country);
   }
  }


 class Employee{
  public   float salary =4000;
}
class A{
    void dispaly(){
        System.out.println("Inheritance "+"A");
    }
}
class B{
    void dispaly(){
        System.out.println("Inheritance "+"B");
    }
}


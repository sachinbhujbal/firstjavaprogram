package com.company;

public class access_specifier {
    public void display(){
        System.out.println("Hi I am public");
    }
    private void display1(){
        System.out.println("Hi i am private");
    }
    protected void display2(){
        System.out.println("Hi, i am protected");
    }
    public static void main(String[] args) {
    access_specifier obj=new access_specifier();
    obj.display();
    obj.display1();
    obj.display2();
    }
}


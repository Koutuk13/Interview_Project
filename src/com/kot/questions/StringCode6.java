package com.kot.questions;

public class StringCode6 {

    public static void main(String[] args) {
        String s1 = "Hi everyone Koutuk Koutuk here";
        String[] s2 = s1.split(" ");
        StringBuilder newString = new StringBuilder();

        for(int i=0; i< s2.length;i++){
            if(i==0){
                newString.append(s2[i]);
            }
            if(newString!=null && !newString.toString().contains(s2[i])){
                newString = newString.append(" ").append(s2[i]);
            }
        }
        System.out.println(newString);
    }

    public void method(){
        Thread t1 = new Thread(()->method1());
        t1.start();
    }

    public void method1(){
        Thread t2 = new Thread(()->method2());
        t2.start();
    }

    public void method2(){
        Thread t2 = new Thread(()->method1());
        t2.start();
    }
}
/*
Products
countryid productid
A p1 10
A p2 11
A p3 13
B p1 10
B p2 11
B p3 13
*/

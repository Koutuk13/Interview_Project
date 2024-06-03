package com.kot.questions;

public class DB_Project_Interview1 {
    public static void main(String[] args) {
        //2/3 + 3/2

        float ans = (2f/3f) + (3f/2f);
        System.out.println("the answer is : " + ans);

        //deposit P -  100
        //rate - 10% p.a
        //maturity - 200

        //after 1 year  - deposit  - 110
        int i =0;
        float p = 100.0f;
        float m = 0.0f;
        while(m < 200.0f){
            System.out.println("principal is :: "+ p);
            m = p + ((10f/100f) * p);
            i++;
            p = m;
            System.out.println("After " + i + " years maturity is :: "+ m);
        }
        System.out.println(i);
        System.out.println("==============================");

        int a = 761;    //761;
        int r,q = 0;
        //0101   7= 111  (4+2+1)
        StringBuilder s = new StringBuilder();
        while(a>0){
            r = a%2;
            q = a/2;
            a=q;
            s.append(r);
        }
        System.out.print(s.reverse());


    }
}

package com.kot.questions;

import java.util.HashMap;

public class WellsFargoCode1 {

    public static void main(String[] args) {
        HashMap<Employee,String> h = new HashMap<>();
        Employee e1 = new Employee(1,"Ram");
        Employee e2 = new Employee(1,"Ram");

        String value1 = h.put(e1,"abc");
        System.out.println("Value for key1 is :: "+ value1);
        String value2 = h.put(e2,"xyz");
        System.out.println("Value for key2 is :: "+ value2);

        String value3 = h.get(e1);
        System.out.println("Value for employee1 is :: "+ value3);

        String value4 = h.get(e2);
        System.out.println("Value for employee1 is :: "+ value4);
    }
}

class Employee{
    public int id;
    public String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode(){
        return  id;
    }
}

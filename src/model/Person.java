package model;

import util.Display;

public class Person implements Display {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String display() {
        return "Name: " + name + ", Age: " + age;
    }
}

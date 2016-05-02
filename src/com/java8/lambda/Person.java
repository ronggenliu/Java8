package com.java8.lambda;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
    	this.age = age;
    	this.name = name;
    }

    public void setAge(int age) {
    	this.age = age;
    }

    public int getAge() {
    	return this.age;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getName() {
    	return this.name;
    }
}

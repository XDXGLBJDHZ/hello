package com.unit2;

public class Animal {
    private int age;
    private String name;
    private int height;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(int age, String name, int height, String color) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.color = color;
    }
}

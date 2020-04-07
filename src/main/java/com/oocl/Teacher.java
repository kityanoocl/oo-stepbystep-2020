package com.oocl;

public class Teacher extends Person{
    public Teacher()
    {

    }

    public Teacher(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String introduce()
    {
        return String.format("%s Teaching for the future of world.", super.introduce());
    }
}

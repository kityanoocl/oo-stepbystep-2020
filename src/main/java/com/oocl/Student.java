package com.oocl;

public class Student extends Person{
    public Student()
    {
        super();
    }
    public Student(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String introduce()
    {
        return String.format("%s Coding for the glory of OOCL.", super.introduce());
    }
}

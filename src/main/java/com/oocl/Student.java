package com.oocl;

public class Student extends Person{
    int classNo;
    public Student()
    {
        super();
    }
    public Student(String name, int age, int classNo)
    {
        super(name, age);
        this.classNo = classNo;
    }

    @Override
    public String introduce()
    {
        return String.format("%s I am a student of class %d. Coding for the glory of OOCL.", super.introduce(), classNo);
    }
}

package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    List<ClassManagement> classList;
    public Teacher()
    {
        classList = new ArrayList<ClassManagement>();
    }

    public Teacher(String name, int age)
    {
        super(name, age);
        classList = new ArrayList<ClassManagement>();
    }

    public void assignClass(ClassManagement classToTeach)
    {
        if (classList.size() < 6)
            classList.add(classToTeach);
    }

    @Override
    public String introduce()
    {
        return String.format("%s Teaching for the future of world.", super.introduce());
    }
}

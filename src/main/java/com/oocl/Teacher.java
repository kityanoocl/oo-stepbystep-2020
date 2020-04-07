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

    public boolean assignClass(ClassManagement classToTeach)
    {
        if (classList.size() < 5) {
            classList.add(classToTeach);
            return true;
        }
        return false;
    }

    @Override
    public String introduce()
    {
        return String.format("%s Teaching for the future of world.", super.introduce());
    }
}

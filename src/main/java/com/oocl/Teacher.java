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
        if (classList.size() < 5 && !classList.contains(classToTeach)) {
            classList.add(classToTeach);
            return true;
        }
        return false;
    }

    public String welcomeStudent(Student student)
    {
        return String.format("%s Welcome %s join Class %d.", this.introduce(), student.getName(), student.classNo);
    }

    public String greetClassLeader(Student classLeader)
    {
        return String.format("%s %s is the leader of class %d.", this.introduce(), classLeader.getName(), classLeader.getClassNo());
    }

    @Override
    public String introduce()
    {
        return String.format("%s Teaching for the future of world.", super.introduce());
    }
}

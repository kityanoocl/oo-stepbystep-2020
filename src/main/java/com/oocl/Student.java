package com.oocl;

public class Student extends Person{
    int classNo;
    boolean isClassLeader;
    public Student()
    {
        super();
        this.classNo = -1;
        this.isClassLeader = false;
    }
    public Student(String name, int age)
    {
        super(name, age);
        this.classNo = -1;
        this.isClassLeader = false;
    }
    public Student(String name, int age, int classNo)
    {
        super(name, age);
        this.classNo = classNo;
        this.isClassLeader = false;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public boolean isClassLeader() {
        return isClassLeader;
    }

    public void setClassLeader(boolean classLeader) {
        isClassLeader = classLeader;
    }

    @Override
    public String introduce()
    {
        return String.format("%s I am a student of class %d. Coding for the glory of OOCL.", super.introduce(), classNo);
    }
}

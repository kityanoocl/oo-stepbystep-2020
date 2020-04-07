package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassManagement {
    int classNo;
    Teacher teacher;
    Student classLeader;
    List<Student> students;

    public ClassManagement(int classNo) {
        this.classNo = classNo;
        students = new ArrayList<Student>();
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public String studentJoin(Student student) {
        if (student.classNo == -1) {
            students.add(student);
            student.setClassNo(this.classNo);
            return String.format("%s Welcome %s join Class %d.", teacher.introduce(), student.getName(), this.classNo);
        }
        return String.format("%s is already assigned in Class %d, cannot assign in Class %d.", student.getName(), student.getClassNo(), this.classNo);
    }

    public void assignClassLeader() {
        Random rand = new Random();
        classLeader =  students.get(rand.nextInt(students.size()));
        classLeader.setClassLeader(true);
    }
}

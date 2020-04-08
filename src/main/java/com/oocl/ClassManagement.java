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

    public String setTeacher(Teacher teacher) {
        if (teacher.assignClass(this)) {
            this.teacher = teacher;
            return String.format("%s is teaching class %d.", teacher.getName(), this.classNo);
        }
        return String.format("%s is already teaching 5 classes or already teaching this class.", teacher.getName());
    }

    public Student getClassLeader() {
        return classLeader;
    }

    public String studentJoin(Student student) {
        if (student.classNo == -1) {
            String welcomePrompt = "";
            student.setClassNo(this.classNo);
            if (this.teacher != null)
                welcomePrompt = this.teacher.welcomeStudent(student);

            for (Student otherStudent : students) {
                if (welcomePrompt != "") welcomePrompt += " ";
                welcomePrompt += otherStudent.welcomeStudent(student);
            }

            students.add(student);

            return (welcomePrompt == "") ? String.format("Welcome %s join Class %d.", student.getName(), this.classNo) : welcomePrompt;
        }
        return String.format("%s is already assigned in Class %d, cannot assign in Class %d.", student.getName(), student.getClassNo(), this.classNo);
    }

    public String assignClassLeader(Student student) {
        if (students.contains(student)) {
            String greetingPrompt = "";
            if (classLeader != null) classLeader.setClassLeader(false);
            classLeader = student;
            classLeader.setClassLeader(true);
            if (this.teacher != null)
                greetingPrompt = this.teacher.greetClassLeader(classLeader);

            for (Student element : students) {
                if (element != classLeader) {
                    if (greetingPrompt != "") greetingPrompt += " ";
                    greetingPrompt += element.greetClassLeader(classLeader);
                }
            }

            return (greetingPrompt == "") ? String.format("%s is assigned as class leader.", this.classLeader.getName()) : greetingPrompt;
        }
        return String.format("%s is not belong to this class.", student.getName());
    }
}

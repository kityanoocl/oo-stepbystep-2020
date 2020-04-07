package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassManagementTest {
    @Test
    public void should_student_join_class_correct()
    {
        ClassManagement class2 = new ClassManagement(2);
        ClassManagement class3 = new ClassManagement(3);
        Teacher teacher = new Teacher("Woody", 30);
        Student studentF = new Student("Tom", 18);
        Student studentG = new Student("Mary", 19);
        class2.setTeacher(teacher);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", class2.studentJoin(studentF));
        Assert.assertEquals("Tom is already assigned in Class 2, cannot assign in Class 3.", class3.studentJoin(studentF));
        Assert.assertEquals("Welcome Mary join Class 3.", class3.studentJoin(studentG));
    }

    @Test
    public void should_assign_class_leader_correct()
    {
        ClassManagement class2 = new ClassManagement(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student studentF = new Student("Tom", 18);
        Student studentG = new Student("Mary", 17);
        class2.studentJoin(studentG);
        Assert.assertEquals("Mary is assigned as class leader.", class2.assignClassLeader(studentG));
        Assert.assertEquals("Tom is not belong to this class.", class2.assignClassLeader(studentF));
        class2.studentJoin(studentF);
        class2.setTeacher(teacher);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.", class2.assignClassLeader(studentF));
    }

    @Test
    public void should_assign_teacher_to_class_correct()
    {
        ClassManagement class1 = new ClassManagement(1);
        ClassManagement class2 = new ClassManagement(2);
        ClassManagement class3 = new ClassManagement(3);
        ClassManagement class4 = new ClassManagement(4);
        ClassManagement class5 = new ClassManagement(5);
        ClassManagement class6 = new ClassManagement(6);
        Teacher teacher = new Teacher("Woody", 30);
        Assert.assertEquals("Woody is teaching class 1.", class1.setTeacher(teacher));
        Assert.assertEquals("Woody is teaching class 2.", class2.setTeacher(teacher));
        Assert.assertEquals("Woody is teaching class 3.", class3.setTeacher(teacher));
        Assert.assertEquals("Woody is teaching class 4.", class4.setTeacher(teacher));
        Assert.assertEquals("Woody is teaching class 5.", class5.setTeacher(teacher));
        Assert.assertEquals("Woody is already teaching 5 classes.", class6.setTeacher(teacher));
    }
}
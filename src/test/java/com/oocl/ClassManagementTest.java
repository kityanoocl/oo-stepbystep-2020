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
        class2.setTeacher(teacher);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.", class2.studentJoin(studentF));
        Assert.assertEquals("Tom is already assigned in Class 2, cannot assign in Class 3.", class3.studentJoin(studentF));
    }

    @Test
    public void should_assign_class_leader_correct()
    {
        ClassManagement class2 = new ClassManagement(2);
        Teacher teacher = new Teacher("Woody", 30);
        Student studentF = new Student("Tom", 18);
        Student studentG = new Student("Mary", 17);
        class2.setTeacher(teacher);
        class2.studentJoin(studentF);
        Assert.assertEquals("Tom is assigned as class leader.", class2.assignClassLeader(studentF));
        Assert.assertEquals("Mary is not belong to this class.", class2.assignClassLeader(studentG));
    }
}
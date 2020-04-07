package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void should_student_introduce_correct()
    {
        Student student = new Student("Tom", 18, 2);
        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.", student.introduce());
    }
}
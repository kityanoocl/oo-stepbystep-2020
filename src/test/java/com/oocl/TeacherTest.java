package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class TeacherTest {
    @Test
    public void should_teacher_introduce_right()
    {
        Teacher teacher = new Teacher("Woody", 30);
        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world.", teacher.introduce());
    }
}
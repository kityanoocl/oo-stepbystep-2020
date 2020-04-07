package com.oocl;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void should_person_introduce_correct()
    {
        Person person = new Person("Tom", 21);
        Assert.assertEquals("My name is Tom. I am 21 years old.", person.introduce());
    }
}
package com.geek.lesson36;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    private Math math;
    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }

    @Test

    public void add() {
        assertEquals(10,math.add(5.7, 5.2));
        System.out.println("add");
    }


    @Test
    public void sub() {
        assertEquals(5, math.sub(7, 2));
        System.out.println("add");
    }

    @Test
    public void multiply() {
        assertEquals(14, math.multiply(7, 2));
        System.out.println("add");
    }

    @Test
    public void div() {
        assertEquals(7, math.div(14, 2));
        System.out.println("add");
    }

    @Test
    public void wordReverseTest(){
        assertEquals("New-York GeekTech Hello Hi", math.reverse("Hi Hello GeekTech New-York"));
        System.out.println();
    }

    @After
    public void tearDown(){
        math = null;
        System.out.println("After");
    }

}

package com.example.junit.demo;

import com.example.junit.demo.Entregable2.Calculation;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class CalculationTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4, Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(0,Calculation.findMax(new int[]{-12,-3,-4,0}));
        
    }
}

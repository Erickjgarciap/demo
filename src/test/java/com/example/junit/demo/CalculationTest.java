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
        System.out.println("caso de prueba para encotrar el maximo elemento de un arreglo");
        assertEquals(4, Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(0,Calculation.findMax(new int[]{-12,-3,-4,0}));

    }
    @Test
    public void testCube(){
        System.out.println("caso de prueba cubo");
        assertEquals(27,Calculation.cube(3));
    }
}

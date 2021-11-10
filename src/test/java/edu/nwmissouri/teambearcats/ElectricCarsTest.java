/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.teambearcats;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test using ElectricCars using JUnit5
 * @author Nikhil Porika
 */
public class ElectricCarsTest {
    
    public ElectricCarsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumOfWheels method, of class ElectricCars.
     */
    @Test
    public void testGetNumOfWheels() {
        System.out.println("getNumOfWheels");
        ElectricCars instance = null;
        int expResult = 0;
        int result = instance.getNumOfWheels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfWheels method, of class ElectricCars.
     */
    @Test
    public void testSetNumOfWheels() {
        System.out.println("setNumOfWheels");
        int numOfWheels = 0;
        ElectricCars instance = null;
        instance.setNumOfWheels(numOfWheels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ElectricCars.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ElectricCars instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ElectricCars.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ElectricCars instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMile method, of class ElectricCars.
     */
    @Test
    public void testGetMile() {
        System.out.println("getMile");
        ElectricCars instance = null;
        double expResult = 0.0;
        double result = instance.getMile();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMile method, of class ElectricCars.
     */
    @Test
    public void testSetMile() {
        System.out.println("setMile");
        double mile = 0.0;
        ElectricCars instance = null;
        instance.setMile(mile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ElectricCars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ElectricCars instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class ElectricCars.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        ElectricCars instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speed method, of class ElectricCars.
     */
    @Test
    public void testSpeed() {
        System.out.println("speed");
        ElectricCars instance = null;
        instance.speed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class ElectricCars.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        ElectricCars instance = null;
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
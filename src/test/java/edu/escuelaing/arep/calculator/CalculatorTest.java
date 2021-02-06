/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.LinkedList.LinkedList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author esteb
 */
public class CalculatorTest extends TestCase {
    
    public CalculatorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of Mean method, of class Calculator.
     */
    public void testMean() {
        System.out.println("Mean");
        LinkedList<Double> Numbers = new LinkedList<Double>();
        Numbers.add(160.0);
        Numbers.add(591.0);
        Numbers.add(114.0);
        Numbers.add(229.0);
        Numbers.add(230.0);
        Numbers.add(270.0);
        Numbers.add(128.0);
        Numbers.add(1657.0);
        Numbers.add(624.0);
        Numbers.add(1503.0);
        Double expResult = 550.6;
        Double result = Calculator.Mean(Numbers);
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Deviation method, of class Calculator.
     */
    public void testDeviation() {
        System.out.println("Deviation");
        LinkedList<Double> Numbers = new LinkedList<Double>();
        Numbers.add(15.0);
        Numbers.add(69.9);
        Numbers.add(6.5);
        Numbers.add(22.4);
        Numbers.add(28.4);
        Numbers.add(65.9);
        Numbers.add(19.4);
        Numbers.add(198.7);
        Numbers.add(38.8);
        Numbers.add(138.2);
        Double expResult = 62.25583060601187;
        Double result = Calculator.Deviation(Numbers);
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of Mean method, of class Calculator.
     */
    public void testMean2() {
        System.out.println("Mean2");
        LinkedList<Double> Numbers = new LinkedList<Double>();
        Numbers.add(15.0);
        Numbers.add(69.9);
        Numbers.add(6.5);
        Numbers.add(22.4);
        Numbers.add(28.4);
        Numbers.add(65.9);
        Numbers.add(19.4);
        Numbers.add(198.7);
        Numbers.add(38.8);
        Numbers.add(138.2);
        Double expResult = 60.32000000000001;
        Double result = Calculator.Mean(Numbers);
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Deviation method, of class Calculator.
     */
    public void testDeviation2() {
        System.out.println("Deviation2");
        LinkedList<Double> Numbers = new LinkedList<Double>();
        Numbers.add(160.0);
        Numbers.add(591.0);
        Numbers.add(114.0);
        Numbers.add(229.0);
        Numbers.add(230.0);
        Numbers.add(270.0);
        Numbers.add(128.0);
        Numbers.add(1657.0);
        Numbers.add(624.0);
        Numbers.add(1503.0);
        Double expResult = 572.026844746915;
        Double result = Calculator.Deviation(Numbers);
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

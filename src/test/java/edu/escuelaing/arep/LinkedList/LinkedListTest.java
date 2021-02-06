/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.LinkedList;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import junit.framework.TestCase;

/**
 *
 * @author esteb
 */
public class LinkedListTest extends TestCase {
    
    public LinkedListTest(String testName) {
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
     * Test of size method, of class LinkedList.
     */
    public void testSize() {
        System.out.println("size");
        LinkedList instance = new LinkedList();
        instance.add(1.0);
        instance.add(2.0);
        instance.add(3.0);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class LinkedList.
     */
    public void testIterator() {
        System.out.println("iterator");
        LinkedList instance = new LinkedList();
        instance.add(1.0);
        instance.add(2.0);
        instance.add(3.0);
        try{
            for(Object x:instance){
                continue;
            }
        }
        catch(Exception e){
            System.out.println("no funciona el iterador");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class LinkedList.
     */
    public void testAdd_GenericType() {
        System.out.println("add");
        System.out.println("remove");
        LinkedList instance = new LinkedList();
        instance.add(1.0);
        instance.add(2.0);
        instance.add(3.0);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
}

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
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author esteb
 */
public class LinkedList<E> implements List<E>{
    Node tail = null;
    Node head = null;
    int size = 0;
    
    /**
    * Metodo implementado para imprimir el LinkedList
    **/
    
    public void print(){
        Node init = head;
        for(int i=0; i<size; i++){
            if(i != size-1){
                System.out.println(init.getNode());
                init = (Node) init.getNextNode();
            }
            else{
                System.out.println(init.getNode());
            }
        }
    }
    
    /** 
    * El metodo de removeFirst es el encargado de sacar el primer elemento del linkedList
    * 
    * @return E elemento eliminado del LinkedList
    **/
    
    public E removeFirst(){
        E saliente=(E) null;
            if (tail != null) {
            saliente = (E) head.getNode();
            head = (Node) head.getNextNode();
            }
	size--;
	return saliente; 
    }
    
    /**
    * El metodo de size es el encargado de dar el tamaño del LinkedList
    * 
    * @return int tamaño del LinkedList
    **/
    @Override
    public int size() {
        return size;
    }
    
    /**
    * El metodo de isEmpty es el encargado de decir si el LinkedList esta vacio o no
    * 
    * @return boolean  El LinkedList esta vacio o no
    **/

    @Override
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator;
        iterator = new Iterator<E>() {
            Node currentNode = head;
            @Override
            public boolean hasNext() {
                if(currentNode == null){
                    return false;
                }
                else{
                    return true;
                }
            }

            @Override
            public E next() {
                E value = (E) currentNode.getNode();
                currentNode = (Node) currentNode.getNextNode();
                return value;
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /** 
    * El metodo de add es el encargado de agregar cada elemento al linkedList
    * 
    * @param e sera el elemento a agregar al LinkedList
    **/
    @Override
    public boolean add(E e) {
        Node NewNode = new Node(e);
        if (head != null) {
            tail.setNextNode(NewNode);
            tail = NewNode;
	}
	else {
            head = NewNode;
            tail = NewNode;
	}
	size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort(Comparator<? super E> c) {
        List.super.sort(c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return List.super.removeIf(filter); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream<E> stream() {
        return List.super.stream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream<E> parallelStream() {
        return List.super.parallelStream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        List.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }
    
}

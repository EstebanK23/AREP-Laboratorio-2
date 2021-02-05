/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.LinkedList;

/**
 *
 * @author esteb
 */
public class Node<N> {
    private N value;
    private N NextNode = null;
    
    
    /**
    * Metodo encargado de dar valor al elemento
    * 
    * @param node Elemento que ingresa
    **/
    public Node(N node){
        this.value = node;
    }
    
    /**
    * Metodo encargado retornar el valor de un elemento
    * 
    * @return N valor de un elemento agregado
    **/
    public N getNode(){
        return value;
    }
    
    /**
    * Metodo encargado retornar el nodo siguiente
    * 
    * @return N elemento siguiente al agregado.
    **/
    public N getNextNode(){
        return NextNode;
    }
    
    /**
    * Metodo encargado cambiar el valor para el valor sigueinte al agregado
    * 
    * @param NewNextNode Elemento que sera el nuevo que sigue al agregado
    **/
    public void setNextNode(N NewNextNode){
        this.NextNode=NewNextNode;
    }
}

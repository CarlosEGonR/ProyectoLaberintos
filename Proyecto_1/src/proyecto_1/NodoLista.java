/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

/**
 *
 * @author marin
 */
public class NodoLista {
    
    int clave;
    NodoLista siguiente;

    
    // constructor 1
    public NodoLista(int dato){
        this.clave = dato;
        this.siguiente = null;
    
    }
    
    // constructor 2
    public NodoLista(int dato, NodoLista siguiente) {
        this.clave = dato;
        this.siguiente = siguiente;
    }
    
    
    
    
    
}

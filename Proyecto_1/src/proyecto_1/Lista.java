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
public class Lista {
    
    NodoLista pFirst;
    NodoLista pLast;
    int size;

    
    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean EsVacio(){
        return (pFirst == null);
    }
    
    
    
    
    
}

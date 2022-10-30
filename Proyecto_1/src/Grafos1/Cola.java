/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafos1;

/**
 *
 * @author Carlo
 */
public class Cola {
    private Nodo pInicio;
    private Nodo pFinal;
    private int size;
    
    //constructor de la cola
    public Cola() {
        pInicio = null;
        pFinal = null;
        size = 0;
    }
    
    //vaciar la cola
    public void vaciarCola(){
        this.pInicio = this.pFinal = null;
        this.size = 0;
    }
    
    /**
     * @return the pInicio
     */
    public Nodo getpInicio() {
        return pInicio;
    }

    /**
     * @param pInicio the pInicio to set
     */
    public void setpInicio(Nodo pInicio) {
        this.pInicio = pInicio;
    }

    /**
     * @return the pFinal
     */
    public Nodo getpFinal() {
        return pFinal;
    }

    /**
     * @param pFinal the pFinal to set
     */
    public void setpFinal(Nodo pFinal) {
        this.pFinal = pFinal;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean EsVacio() {
        return pInicio == null;
    }
    
    public void Encolar(Object elemento){
        Nodo nuevo = new Nodo(elemento);
        if(EsVacio()){
            pInicio = pFinal = nuevo;
        }else{
            Nodo aux = pFinal;
            aux.setSiguiente(nuevo);
        }
        pFinal = nuevo;
        size++;
    }
    
    public void Desencolar(){
        if(!EsVacio()){
           pInicio = pInicio.getSiguiente();
           if(pInicio == null){
               pFinal = null;
           }
        }
        size--;
    }
    
    public Object LeerCabeza(){
        return pInicio.getElemento();
    }
}

package Grafos1;

/**
 *
 * @author marin
 */
public class Nodo {
    
    private Object elemento;
    private Nodo siguiente;

    
    public Nodo(Object elemento){
        this.elemento = elemento;
        this.siguiente = null;

    }
    
    
    public Nodo(Object elemento, Nodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
    
}

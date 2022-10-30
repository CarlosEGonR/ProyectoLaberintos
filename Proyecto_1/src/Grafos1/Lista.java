
package Grafos1;



/**
 *
 * @author marin
 */
public class Lista {
    
    Nodo pFirst;
    Nodo pLast;
    int size;

    
    // Constructor
    public Lista() {
        pFirst = null;
        pLast = null;
        size = 0;
    }
    
    
    public boolean EsVacio(){
        return (pFirst == null);
    }
    
    
    public boolean existe_elemento(Object elemento){
        if (EsVacio()){
            return false;
        }
        else{
            if (size == 1){
                return (pFirst.getElemento() == elemento);
            }
            else{
                Nodo aux = pFirst;
                for (int i = 0; i < size; i++) {
                    if (aux.getElemento() == elemento){
                        return true;
                    }
                    else{
                        aux = aux.getSiguiente();
                    }
                }
                return false;
            }
        }

    }
    
     
}


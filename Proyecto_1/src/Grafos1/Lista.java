
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
    
    public void eliminar_segun_elemento(Object elemento){
        if(EsVacio()){
            System.out.println("La lista esta vacia.");
        }
        else{
            Nodo aux = pFirst;
            if(aux.getElemento() == elemento){
                pFirst = aux.getSiguiente();
            }
            else{
                if(pLast.getElemento() == elemento){
                    for (int i = 0; i < (size-2); i++) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(null);
                }
                else{
                    Nodo aux2 = pFirst.getSiguiente();
                    while(aux2.getElemento() != elemento){
                        aux2 = aux2.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    aux2 = aux2.getSiguiente();
                    aux.setSiguiente(aux2);
                }         
            }
            size--;
        }
        
    }
    
     
}


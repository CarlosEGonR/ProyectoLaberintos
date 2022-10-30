
package Grafos1;



/**
 *
 * @author marin
 */
public class Vertice {
    
    String nombre;
    int numVertice; // indice
    Lista listAdy;
    
    
    // Constructor
    
    public Vertice(String name){
    
        nombre = name;
        numVertice = -1;
        listAdy = new Lista();
    }
    
    
    // Devuelve verdadero si los dos Vertices se llaman igual
    public boolean Iguales(Object d){
        Vertice dos = (Vertice) d;
        return nombre.equals(dos.nombre);
        
    }
    
    // Indica el numero que identificara este vertice. Indice.
    public void AsignarVertice(int n){
        numVertice = n;
       
    }
    
    // Devuelve el nombre del Vertice
    public String NombreVertice(){
        return nombre;
    }
    
    // Imprime el nombre y numero de Vertice
    public String Imprimir(){
        return nombre + " (" + numVertice + ")";
        
    }
    
    
    
    
    
    
}

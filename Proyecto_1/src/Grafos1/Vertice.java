
package Grafos1;



/**
 *
 * @author marin
 */
public class Vertice {
    
    private String nombre;
    private int numVertice; // indice
    private Lista listAdy;
    
    
    // Constructor
    
    public Vertice(String name){
    
        nombre = name;
        numVertice = -1;
        listAdy = new Lista();
    }
    
    
    // Devuelve verdadero si los dos Vertices se llaman igual
    public boolean Iguales(Object d){
        Vertice dos = (Vertice) d;
        return getNombre().equals(dos.getNombre());
        
    }
    
    // Indica el numero que identificara este vertice. Indice.
    public void AsignarVertice(int n){
        setNumVertice(n);
       
    }
    
    // Devuelve el nombre del Vertice
    public String NombreVertice(){
        return getNombre();
    }
    
    // Imprime el nombre y numero de Vertice
    public String Imprimir(){
        return getNombre() + " (" + getNumVertice() + ")";
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numVertice
     */
    public int getNumVertice() {
        return numVertice;
    }

    /**
     * @param numVertice the numVertice to set
     */
    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    /**
     * @return the listAdy
     */
    public Lista getListAdy() {
        return listAdy;
    }

    /**
     * @param listAdy the listAdy to set
     */
    public void setListAdy(Lista listAdy) {
        this.listAdy = listAdy;
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos1;


/**
 *
 * @author marin
 */
public class Grafo {

    int numVertices;
    static int maxVertices = 20;
    Vertice[] tablaAdy; // [_,_,_,_,_]

    // Constructor: Parametro: mx: maximo de vertices que va a tener el grafo
    public Grafo(int mx) {
        tablaAdy = new Vertice[mx]; // Ej: Vertice[5] = [_,_,_,_,_] indices: 0,1,2,3,4
        numVertices = 0; // Num de vertices actuales
        maxVertices = mx;

    }

    // Devuelve el vector
    public Vertice[] Vector() {
        return tablaAdy;
    }

    
    // Devuelve la lista de adyacencia del vertice v
    public Lista ListaAdyacencia(int v) throws Exception{

        if (v < 0 || v >= numVertices) {
            throw new Exception("Vertice fuera de rango");
        }
        
        return tablaAdy[v].listAdy;
    }

    // Busca y devuelve la posicion del vertice, si no lo encuetra devuelve -1
    public int BuscarNumVertice(String nombre){
        Vertice v = new Vertice(nombre);
        boolean encontrado = false;
        int i = 0;
        while((i < numVertices) && (!encontrado)){
            encontrado = tablaAdy[i].Iguales(v); //compara el nombre de los vertices
            if(!encontrado){
                i++;
            }
        }
        if (i < numVertices){
            return i;
        }else{
            return -1;
        }
    
    }
    
    
    // Crea un vertice nuevo
    public void CrearVertice(String nombre){
        boolean existe = BuscarNumVertice(nombre) >= 0;
        if (!existe){
            Vertice v = new Vertice(nombre);
            v.AsignarVertice(numVertices);
            tablaAdy[numVertices] = v;
            numVertices++;
        }
    
    }
    
    // Comprueba si dos vertices son adyacentes
    boolean SonAdyacentes(String a, String b) throws Exception{
        int v1 = BuscarNumVertice(a); 
        int v2 = BuscarNumVertice(b);
        if (v1 < 0 || v2 < 0){
            throw new Exception("El vertice no existe");
        }
        if (tablaAdy[v1].listAdy.existe_elemento(new Arco(v2))) {
            return true;
        } else{
            return false;
        }
    }
    
    // Comprueba si dos vertices son adyacentes por el numero de vertice
    boolean SonAdyacentesIndex(int v1, int v2) throws Exception{
        if(tablaAdy[v1].listAdy.existe_elemento((new Arco(v2)))){
            return true;
        }else{
            return false;
        }
    
    }
    
    // Crea un nuevo arco
    public void CrearArco(String a, String b) throws Exception{
        if(!SonAdyacentes(a,b)){
            int v1 = BuscarNumVertice(a);
            int v2 = BuscarNumVertice(b);
            if(v1 < 0 || v2 < 0){
                throw new Exception("El vertice no existe");
            }
            Arco ab = new Arco(v2);
            tablaAdy[v1].listAdy.eliminar_segun_elemento(ab);
            
        }
    
    }
    
    
}


package Grafos1;

/**
 *
 * @author marin
 */
public class Arco {
    
    private int destino; // hacia cual apunta
    private double peso; 
    
    
    // Constructor 1
    public Arco(int d){
        destino = d;
        
    }
    
    // Constructor 2
    public Arco(int d, double p){
    
        this(d);
        peso = p;
        
    }
    
    // Revisa si el destino es el mismo, por ende el arco puede ser igual.
    public boolean Iguales(Object n){
        
        Arco a = (Arco)n; 
        return getDestino() == a.getDestino();
    }

    /**
     * @return the destino
     */
    public int getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(int destino) {
        this.destino = destino;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}

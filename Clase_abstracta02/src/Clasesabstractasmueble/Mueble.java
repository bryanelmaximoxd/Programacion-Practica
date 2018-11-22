
package Clasesabstractasmueble;


public abstract class Mueble {
    protected int volumen;
    protected int precio;
    protected int peso;
    
    protected int precio_actual;
    
    public Mueble(int precio_actual){
        this.precio_actual=precio_actual;
    }
    public Mueble(int volumen, int precio, int peso){
        this.volumen=volumen;
        this.peso=peso;
        this.precio=precio;
        
        
    }
    public abstract void precio_venta();
    
}

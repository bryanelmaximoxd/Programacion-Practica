
package Clasesabstractas;


public abstract class Vehiculo {
    
    protected int Velocidad_actual;
    
    public Vehiculo(int velocidad){
        this.Velocidad_actual=velocidad;
    }
    
    public abstract void acelerar();
    public abstract void frenar();

}


package Clasesabstractas;


public class Camión extends Vehiculo{
 
    public Camión(int velocidad){
        super(velocidad);
    }
    
    @Override
    public void acelerar(){
        super.Velocidad_actual=2*super.Velocidad_actual;
    }
    @Override
    public void frenar(){
        super.Velocidad_actual=super.Velocidad_actual-10;
    }
    public void imprime(){
        System.out.println("La velocidad actual del camion: "+this.Velocidad_actual);
    }        
}

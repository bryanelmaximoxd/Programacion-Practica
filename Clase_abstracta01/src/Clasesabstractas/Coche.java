
package Clasesabstractas;


public class Coche extends Vehiculo{
    
    public Coche(int velocidad){
        super(velocidad);
       
    }

    @Override
    public void acelerar(){
        super.Velocidad_actual=3*super.Velocidad_actual;
    }
    @Override
    public void frenar(){
        super.Velocidad_actual=super.Velocidad_actual-40;
    }
    public void imprime(){
        System.out.println("La velocidad actual del coche es: "+this.Velocidad_actual);
    }        
}


package Clasesabstractas;


public class Bicicleta extends Vehiculo{
    int plato_actual,piñon_actual;
    
    public Bicicleta(int velocidad,int plato, int piñon){
        super(velocidad);
        this.plato_actual=plato;
        this.piñon_actual=piñon;
    }
    
    public void Cambiar_plato(int plato){
        this.plato_actual=plato;
    }
    
    public void Cambiar_piñon(int piñon){
        this.piñon_actual=piñon;
    }
    @Override
    public void acelerar(){
        this.Velocidad_actual=3*Velocidad_actual;
    }
    @Override
    public void frenar(){
        this.Velocidad_actual=Velocidad_actual/2;
    }
    //@Override
    public void imprime(){
        System.out.println("el plato actual es: "+this.plato_actual);
        System.out.println("El piñon actual es: "+this.piñon_actual);
        System.out.println("La velocidad actual de la bicicleta es: "+this.Velocidad_actual);
    }        
}

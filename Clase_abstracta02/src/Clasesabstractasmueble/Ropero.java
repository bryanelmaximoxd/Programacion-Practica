
package Clasesabstractasmueble;


public class Ropero extends Mueble{
    int precio_melamina;
    public Ropero(int volumen,int precio, int peso,int precio_melamina){
        super(volumen, precio, peso);
        this.precio_melamina=precio_melamina;
       
    }
    
    
    @Override
    public void precio_venta(){
        super.precio=super.precio*precio_melamina;
    }
    
    //@Override
    public void imprime(){
        System.out.println("el precio de venta del ropero de melamina es: "+this.precio);
        
    } 
}

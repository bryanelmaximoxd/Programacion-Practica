
package Clasesabstractasmueble;

public class Escritorio extends Mueble{
    int precio_madera;
    public Escritorio(int volumen,int precio, int peso,int precio_madera){
        super(volumen, precio, peso);
        this.precio_madera=precio_madera;
       
    }
    
    
    @Override
    public void precio_venta(){
        this.precio=peso*precio_madera;
    }
    
    //@Override
    public void imprime(){
        System.out.println("el precio de venta del escritorio de madera es: "+this.precio);
        
    }        
}

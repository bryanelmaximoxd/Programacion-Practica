
package Clasesabstractasmueble;


public class Silla extends Mueble{
    int precio_madera_caoba;
    public Silla(int volumen,int precio, int peso,int precio_madera_caoba){
        super(volumen, precio, peso);
        this.precio_madera_caoba=precio_madera_caoba;
       
    }
    
    
    @Override
    public void precio_venta(){
        super.precio=super.precio*precio_madera_caoba;
    }
    
    //@Override
    public void imprime(){
        System.out.println("el precio de venta de la silla de caoba es: "+this.precio);
        
    }   
}

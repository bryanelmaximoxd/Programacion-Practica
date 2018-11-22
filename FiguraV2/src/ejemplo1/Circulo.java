
package ejemplo1;


public class Circulo extends figura{
    
    private final double pi =3.14;
    
    public Circulo(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public void CalcularArea(){
        System.out.println("El area del circulo es: "+pi*(dim1*dim1));
    }
    @Override
    public void Perimetro(){
        System.out.println("El perimetro del circulo es: "+2*(pi*dim1));
    }
    
}

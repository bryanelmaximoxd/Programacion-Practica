
package ejemplo1;


public class Rectangulo extends figura{

    public Rectangulo(double dim1, double dim2) {
        super(dim1, dim2);
    }
    @Override
    public void CalcularArea(){
        System.out.println("El area del rectagulo es: "+dim1*dim2);
        
    }
    @Override
    public void Perimetro(){
        System.out.println("El perimetro del rectagulo es: "+2*dim1+2*dim2);
    }
}

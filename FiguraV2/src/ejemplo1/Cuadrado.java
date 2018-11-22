
package ejemplo1;


public class Cuadrado extends figura{

    public Cuadrado(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public void CalcularArea(){
        System.out.println("El area del cuadrado es: "+dim1*dim1);
    }
    @Override
    public void Perimetro(){
        System.out.println("El perimetro del cuadrado es: "+4*dim1);
    }
}

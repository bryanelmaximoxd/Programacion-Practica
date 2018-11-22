
package ejemplo1;


public class Triangulo extends figura{
    
    public Triangulo(double dim1, double dim2){
        super(dim1, dim2);
        
    }
    @Override
    public void CalcularArea(){
        System.out.println("El area del tringulo es: "+(dim1*dim2)/2);
    }
    @Override
    public void Perimetro(){
        System.out.println("El perimetro del triangulo es: "+(2*dim1)+dim2);
    }
    
}

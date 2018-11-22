
package ejemplo1;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        //rectangulo rec=new rectangulo(6,7)
        Scanner floyd = new Scanner(System.in);
        System.out.println("Ingrese la base : ");
        Double dim1= floyd.nextDouble();
        System.out.println("Ingrese la altura: ");
        Double dim2= floyd.nextDouble();
        figura fig = new figura(dim1, dim2);
        fig.CalcularArea();
        fig.Perimetro();
        System.out.println("RECTANGULO:");
        fig = new Rectangulo(dim1, dim2);
        fig.CalcularArea();
        fig.Perimetro();
        System.out.println("TRIANGULO:");
        fig=new Triangulo(dim1,dim2);
        fig.CalcularArea();
        fig.Perimetro();
        
        System.out.println("CUADRADO: ");
        fig=new Cuadrado(dim1,0);
        fig.CalcularArea();
        fig.Perimetro();
        System.out.println("CIRCULO: ");
        System.out.println("INGRESE EL RADIO:");
        double radio=floyd.nextDouble();
        fig =new Circulo(radio,0);
        fig.CalcularArea();
        fig.Perimetro();
        
   
    }
    
}

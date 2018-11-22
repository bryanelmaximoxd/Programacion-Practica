
package Clasesabstractasmueble;


public class Test_mueble {


    public static void main(String[] args) {
        System.out.println("Escritorio:");
        Escritorio esc=new Escritorio(3,250,50,4);
        esc.imprime();
        System.out.println("");
        System.out.println("Silla:");
        Silla si=new Silla(2,75,10,12);
        si.imprime();
        System.out.println("");
        System.out.println("Ropero:");
        Ropero ro=new Ropero(8,400,100,12);
        ro.imprime();
        
        
        
    }
    
}


package Clasesabstractas;

public class Test_vehiculo {

    public static void main(String[] args) {
        System.out.println("Bicicleta:");
        Bicicleta bici=new Bicicleta(20,2,1);
        bici.Cambiar_plato(3);
        bici.Cambiar_piñon(4);
        bici.acelerar();
        bici.frenar();
        bici.imprime();
        System.out.println("");
        System.out.println("Camión:");
        Camión cam=new Camión(40);
        cam.acelerar();
        cam.frenar();
        cam.imprime();
        System.out.println("");
        System.out.println("Coche:");
        Coche co=new Coche(50);
        co.acelerar();
        co.frenar();
        co.imprime();
    }
    
}

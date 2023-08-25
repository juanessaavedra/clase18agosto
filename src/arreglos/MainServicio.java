package arreglos;

import java.lang.reflect.Array;

public class MainServicio {
    public static void main(String[] args) {
        ServicioCelular[] servicio = new ServicioCelular[2];
        int[][] x = new int[2] [3]; //Esto es una matriz , 2 filas y 3 columnas
        Cliente cliente = new Cliente(1004916, "Papipeñu");
        Array.set(servicio,0, new ServicioCelular(cliente, "3113231"));
        System.out.println(servicio[0].toString());
        System.out.println(servicio[0].getNumero());
    }
}

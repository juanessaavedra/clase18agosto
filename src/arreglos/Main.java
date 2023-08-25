package arreglos;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"juan", "David", "Peñuela"};
        int [] numeros = {1,5 , 777};
        float [] floats = new float [5];
        System.out.println(numeros.length);
        floats[0] = 1.5f;
        floats[1]= 45.8f;
        Array.set(floats, 0, 7.7f);
        System.out.println(floats[1]);
        System.out.println(Array.get(floats, 1));

        for (float i: floats) {
            System.out.println(1);
        }
    }
}

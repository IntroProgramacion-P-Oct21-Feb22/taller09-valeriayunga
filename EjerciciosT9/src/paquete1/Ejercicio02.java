/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10, 21, 
            -1, 100, 200, 2, 21, 22, 27};
        String[] rangos = {"1-5", "6-10", "11-15", "16-20", "Fuera de Rango"};
        int[] valoresRangos = new int[5]; // {0, 0, 0, 0, 0}
        int respuesta;

        for (int i = 0; i < respuestas.length; i++) {
            respuesta = respuestas[i]; // -1
            if ((respuesta >= 1) && (respuesta <= 5)) {
                valoresRangos[0] = valoresRangos[0] + 1;
            } else {
                if ((respuesta >= 6) && (respuesta <= 10)) {
                    valoresRangos[1] = valoresRangos[1] + 1;
                } else {
                    if ((respuesta >= 11) && (respuesta <= 15)) {
                        valoresRangos[2] = valoresRangos[2] + 1;
                    } else {
                        if ((respuesta >= 16) && (respuesta <= 20)) {
                            valoresRangos[3] = valoresRangos[3] + 1;
                        }else{
                            valoresRangos[4] = valoresRangos[4] + 1;
                        }

                    }
                }

            }
        }

        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }

    }

}

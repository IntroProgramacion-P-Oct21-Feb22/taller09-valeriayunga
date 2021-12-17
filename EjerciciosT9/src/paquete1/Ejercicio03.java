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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        double suma = 0;
        double contador = 0;
        double media;
        int arreglo1;
        int elemento;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            contador = contador + 1;

        }

        media = suma / contador;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo1 = arreglo[i];
            if (arreglo1 > media) {
                elementosArribaMedia = elementosArribaMedia + 1;

            } else {
                if (arreglo1 < media) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;

                }
            }
        }

        System.out.printf("Hay %d elementos arriba de la \n"
                + "Hay %d elemtos abajo de la media",
                 elementosArribaMedia, elementosAbajoMedia);

    }

}

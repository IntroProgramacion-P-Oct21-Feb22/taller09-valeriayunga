/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;
        char[] inicialLetra = new char[7];

        for (int i = 0; i < estudiantes.length; i++) {
            inicialLetra[i] = estudiantes[i].charAt(0);

        }

        while (bandera) {

          

            for (int i = 0; i < estudiantes.length; i++) {
                System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();

                if (inicial.equals(inicialLetra[i])) {

                    bandera = false;
                }

            }

        }

    }

}

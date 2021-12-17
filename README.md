# Taller 9 (Laboratorio)
## Construcción de programas usando arreglos unidimensionales

Revisar los ejercicios propuestos en el proyecto de Netbeans denominado: **EjerciciosT9**

### Ejercicio 1
Analizar el ejercicio, identificar la problemática.

### Ejercicio 2
Permitir que se cuenten las respuestas que están **fuera de los rangos establecidos.**

### Ejercicio 3
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
```
int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
```

### Ejercicio 4
Dados los siguientes arreglos
```
double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", 
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
```

Genere  los datos para el arreglo
```
String[] promediosCualitativos = new String[7];

```
* Promedio Regular son todas las notas >=0 y <=5.9
* Promedio Bueno son todas las notas >=6 y <=8.9
* Promedio Sobresaliente son todas las notas >=9 y <=10

Finalmente presetar un reporte como el que sigue:

```
Kimberly Gonzalez promedio: 10,00 promedio cualitativo ?
Mark Hogan promedio: 10,00 promedio cualitativo ?
Teresa Martinez promedio: 9,10 promedio cualitativo ?
Julia Johnson promedio: 7,00 promedio cualitativo ?
Mark Cook promedio: 6,10 promedio cualitativo ?
Jennifer Manning promedio: 4,00 promedio cualitativo ?
Juan Vasquez promedio: 8,00 promedio cualitativo ?
```

### Ejercicios 5
Analice el siguiente código
```
Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", 
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
 String inicial;
 boolean bandera = true;
 while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
                    
 }
```
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con alguna de las primeras letras de los nombres del arreglo **estudiantes**. Debe usar un ciclo repetitivo para recorrer el arreglo **estudiantes**.
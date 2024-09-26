/*
División crazy (en el método simplex prueba del cociente y renglón pivote)
Descripción
Dadas dos columnas de números decimales, realicen la división elemento a elemento de la segunda columna entre primera, contando a partir del segundo elemento del resultado de la división encuentre el valor positivo más pequeño.
Entrada
Arreglo de números separados por un espacio, por ejemplo: 
1	1
2	0
0	-6
1	8
-3 	 -4
Salida
Valor entero del índice (comenzando en cero, 0-indexing): 0  
Observaciones
Números enteros, positivos, negativos ceros.
Tener cuidado con las divisiones entre cero.
En caso de no haber número que cumpla con el criterio dar como salida -1
Ejemplo:
Entrada:	Salida
 1   1  
 2   0
 0  -6
 1   8
-3  -4	4
-1  1
 1 -1	-1

 */
 /*
* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Metodo simplex(prueba del cociente y renglón pivote).
* TI302 JLS.
* 19 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package unidad1.proglineal;

public class DivisionCrazyTest {
    public static void main(String ...args) {
        //ENTRADA DE DATOS CASO DE PRUEBA 1
        double[] columna1 = {1, 2, 0, 1, -3};
        double[] columna2 = {1, 0, -6, 8, -4};

        DivisionCrazy dc = new DivisionCrazy(columna1, columna2);
        int resultado = dc.resolver();
//        dc.print();

        System.out.println(resultado);
        
        //ENTRADA DE DATOS CASO DE PRUEBA 2
        double[] columna3 = {-1, 1};
        double[] columna4 = {1, -1};

        DivisionCrazy dc1 = new DivisionCrazy(columna3, columna4);
        int resultado1 = dc1.resolver();

        System.out.println(resultado1);
        
    }
}


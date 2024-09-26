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

public class DivisionCrazy {

    private double[] columna1;
    private double[] columna2;
    private double[] division;

    public DivisionCrazy(double[] columna1, double[] columna2) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        this.division = new double[columna1.length];
    }

    public int resolver() {
        for (int i = 0; i < columna1.length; i++) {
            if (columna1[i] == 0) {
                division[i] = Double.POSITIVE_INFINITY;
            } else {
                division[i] = columna2[i] / columna1[i];
            }
        }

        int minIndex = -1;
        double minValue = Double.POSITIVE_INFINITY;

        for (int i = 1; i < division.length; i++) {
            if (division[i] > 0 && division[i] < minValue) {
                minValue = division[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void print() {
        for (int i = 0; i < columna1.length; i++) {
            System.out.println("Div " + i + ": " + division[i]);
        }
    }
}


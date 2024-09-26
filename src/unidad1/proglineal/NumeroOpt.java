/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Matematicas para la toma de decisiones
* TI302 JLS
* 13 DE SEPTIEMBRE DEL 2024
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package unidad1.proglineal;

public class NumeroOpt {

    private int[] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int calcular() {
        int min = arreglo[0];
        int index = 0;

        for (int i = 1; i < arreglo.length; i++) {

            if (arreglo[i] < min) {
                index = i;
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1 : index;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
}

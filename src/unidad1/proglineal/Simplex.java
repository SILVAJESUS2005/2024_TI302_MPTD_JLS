/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Simplex.
* TI302 JLS.
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package unidad1.proglineal;

public class Simplex {

    private double[][] a;

    public Simplex(double[][] a) {
        this.a = a;
    }

    public void DivisionCrazy() {

    }

    public void print() {
        System.out.println("A-------------------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%+6.3f ", a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public int NumeroOpt() {
        double  min = a[0][0];
        int index = 0;

        for (int i = 1; i < a[0].length; i++) {

            if (a[0][i] < min) {
                index = i;
                min = a[0][i];
            }
        }
        return min >= 0 ? -1 : index;
    }

}

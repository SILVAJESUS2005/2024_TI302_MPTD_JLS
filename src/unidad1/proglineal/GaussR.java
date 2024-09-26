/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Metodo GaussR.
* TI302 JLS.
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package unidad1.proglineal;

public class GaussR {

    private double[][] A;
    private int R;
    private int C;

    public GaussR(double[][] A, int R, int C) {
        this.A = A;
        this.R = R;
        this.C = C;
    }

    public void setA(double[][] A) {
        this.A = A;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void setC(int C) {
        this.C = C;
    }

    public void Calular() {
        double divisor = A[R][C];
        for (int i = 0; i < A[R].length; i++) {
            A[R][i] /= divisor;
        }

        for (int i = 0; i < A.length; i++) {
            if (i != R) {
                double factor = A[i][C];
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] -= factor * A[R][j];
                }
            }
        }

        for (double[] row : A) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Metodo GaussRTest.
* TI302 JLS.
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package unidad1.proglineal;

public class GaussRTest {

    public static void main(String[] args) {
        double[][] a = {
            {1.0000, -60.0000, -30.0000, -20.0000, 0, 0, 0, 0, 0},
            {0, 8.0000, 6.0000, 1.0000, 1.0000, 0, 0, 0, 48.0000},
            {0, 4.0000, 2.0000, 1.5000, 0, 1.0000, 0, 0, 20.0000},
            {0, 2.0000, 1.5000, 0.5000, 0, 0, 1.0000, 0, 8.0000},
            {0, 0, 1.0000, 0, 0, 0, 0, 1.0000, 5.0000}
        };
        int renglonPivote = 3;
        int columnaPivote = 1;

        GaussR pruebaUno = new GaussR(a, renglonPivote, columnaPivote);
        pruebaUno.print();
        pruebaUno.pivoting();
        pruebaUno.print();

    }
}

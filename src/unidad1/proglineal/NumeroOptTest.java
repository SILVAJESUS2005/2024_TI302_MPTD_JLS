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


public class NumeroOptTest {
  
    public static void main(String ...args){
        
        int arr []= {1, -3, -6, 9, 0, 1, -2};
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println("nop: " + nop.calcular());
    }
}

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
        //ENTRADA DE DATOS CASO DE PRUEBA 1
        int arr []= {1, -3, -6, 9, 0, 1, -2};
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println("DATOS DE PRUEBA 1: " + nop.calcular());
        
        //ENTRADA DE DATOS CASO DE PRUEBA 2
        int arr1 [] = {1, 2, 3, 4};
        NumeroOpt nop1 = new NumeroOpt(arr1);
        System.out.println("DATOS DE PRUEBA 2:" + nop1.calcular());
        
    }
}


package unidad2.transporte;


public class EsquinaNoroesteTest {
    public static void main(String[] args) {
        double O[] = {5, 10, 15}; //valores de cada oferta
        double D[] = {3, 3, 12, 12}; //valores de cada demanda
        double MatrizCostos[][] = {{20, 11, 3, 6}, {5, 9, 10, 2}, {18, 7, 4, 1}}; // matriz de cada costo que hay 

        EsquinaNoroeste case1 = new EsquinaNoroeste(3, 4); // n es la cantidad de ofertas y m la cantidad de demandas 
        case1.setD(D);
        case1.setO(O);
        case1.setC(MatrizCostos);
        case1.Resolver();
    }
}

package unidad2;

public class CostosMinimosTest {
    public static void main(String[] args) {
        double O[] = {15, 15}; //valores de cada oferta
        double D[] = {10, 10, 10}; //valores de cada demanda
        double MatrizCostos[][] = {{4, 2, 4}, {12, 8, 4}}; // matriz de cada costo que hay (Aun no se ocupa)
        
        CostosMinimos case1 = new CostosMinimos(2, 3); // n es la cantidad de ofertas y m la cantidad de demandas
        case1.setD(D);
        case1.setO(O);
        case1.setMatrizCostos(MatrizCostos);
        case1.solve();
        case1.print();
    }
}

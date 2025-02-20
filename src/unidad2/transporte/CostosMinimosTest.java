package unidad2.transporte;

public class CostosMinimosTest {
    public static void main(String[] args) {
        double O[] = {400, 200, 150}; //valores de cada oferta
        double D[] = {100, 200, 150, 160, 140}; //valores de cada demanda
        double MatrizCostos[][] = {{100, 150, 200, 140, 35}, {50, 70, 60, 65, 80}, {40, 90, 100, 150, 130}}; // matriz de cada costo que hay 

        CostosMinimos case1 = new CostosMinimos(3, 5); // n es la cantidad de ofertas y m la cantidad de demandas
        case1.setD(D);
        case1.setO(O);
        case1.setMatrizCostos(MatrizCostos);
        case1.solve();
        case1.print();
    }
}

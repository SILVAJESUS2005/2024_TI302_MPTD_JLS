package unidad2;

public class CostosMinimos {

    private int m; //Cantidad de demandas
    private int n;  //cantidad de ofertas
    private double O[];// = {60, 50, 40}; //valores de cada oferta
    private double D[];// = {40, 70, 10, 30}; //valores de cada demanda
    private double MatrizCostos[][]; // matriz de cada costo que hay (Aun no se ocupa)
    private double stage[][];

    private int Of;
    private int De;
    private boolean Of_flag[]; //Esta matriz nos sirve para saltarnos las ofertas ya satisfechas
    private boolean De_flag[]; //Esta matriz nos sirve para saltarnos las demandas ya satisfechas

    public CostosMinimos(int n, int m) {
        this.m = m;
        this.n = n;
        stage = new double[n][m];
        Of_flag = new boolean[n];
        De_flag = new boolean[m];
    }

    public void setO(double[] O) {
        this.O = O;
    }

    public void setD(double[] D) {
        this.D = D;
    }

    public void setMatrizCostos(double[][] MatrizCostos) {
        this.MatrizCostos = MatrizCostos;
    }

    public void minc() {
        double Aux = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (Of_flag[i]) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                if (De_flag[j]) {
                    continue;
                }
                if (Aux >= MatrizCostos[i][j]) {
                    Aux = MatrizCostos[i][j];
                    Of = i;
                    De = j;
                }
            }
        }
    }

    public void asignacion() {
        if (O[Of] > D[De]) { //En caso de que la oferta sea mayor a la demanda      En caso de la demanda sea menor a la oferta
            O[Of] = O[Of] - D[De];
            stage[Of][De] = D[De];
            D[De] = 0;
            De_flag[De] = true;

        } else {
            D[De] = D[De] - O[Of];
            stage[Of][De] = O[Of];
            O[Of] = 0;
            Of_flag[Of] = true;
        }
    }
    public void penalizacion(){
        
    }

    public void solve() {

        for (int k = 0; k < m + n - 1; k++) {
            minc();
            asignacion();
        }

    }

    public void print() {
        for (int k = 0; k < stage.length; k++) {
            for (int l = 0; l < stage[k].length; l++) {
                System.out.print(stage[k][l] + "\t");
            }
            System.out.println(" ");

        }
    }
}

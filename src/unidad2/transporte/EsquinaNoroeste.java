package unidad2.transporte;

public class EsquinaNoroeste {

    private int m; //Cantidad de demandas
    private int n;  //cantidad de ofertas
    private double O[] = {60, 50, 40}; //valores de cada oferta
    private double D[] = {40, 70, 10, 30}; //valores de cada demanda
    private double MatrizCostos[][]; // matriz de cada costo que hay (Aun no se ocupa)
    private double stage[][];

    public EsquinaNoroeste(int n, int m) {
        this.m = m;
        this.n = n;
        stage = new double[n][m];
    }

    public void setO(double[] O) {
        this.O = O;
    }

    public void setD(double[] D) {
        this.D = D;
    }

    public void setC(double[][] MatrizCostos) {
        this.MatrizCostos = MatrizCostos;
    }

    public double[][] getStage() {
        return stage;
    }

    public void setStage(double[][] stage) {
        this.stage = stage;
    }

    public void Resolver() {

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (O[i] > D[j]) { //En caso de que la oferta sea mayor a la demanda
                O[i] = O[i] - D[j];
                stage[i][j] = D[j];
                D[j] = 0;
                //stage[i][j] = D[j];
                j++; // aumenta j (demanda) por que al ser la menor cantidad va a ser la que quede satisfecha

            } else {
                D[j] = D[j] - O[i];
                stage[i][j] = O[i];
                O[i] = 0;
                i++;   // aumenta i (Oferta) por que al ser la menor la oferta va a ser la que se agotará y se tendra que pasar a la siguiente oferta
            }
        }
        for (int k = 0; k < stage.length; k++) {
            for (int l = 0; l < stage[k].length; l++) {
                System.out.print(stage[k][l] + "\t");
            }
            System.out.println(" ");

        }

    }

    public void getSolution() {

    }

}

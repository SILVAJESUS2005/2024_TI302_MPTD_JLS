package unidad2;

public class Voguel {

    private int m; // Cantidad de demandas
    private int n; // Cantidad de ofertas
    private double O[]; // Valores de cada oferta
    private double D[]; // Valores de cada demanda
    private double MatrizCostos[][]; // Matriz de costos de transporte
    private double stage[][]; // Matriz para guardar la solución del transporte

    private int Of; // Índice de la oferta seleccionada
    private int De; // Índice de la demanda seleccionada
    private boolean Of_flag[]; // Flags para indicar si una oferta está completamente satisfecha
    private boolean De_flag[]; // Flags para indicar si una demanda está completamente satisfecha

        public Voguel(int n, int m) {
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

    public void penalizacion() {
        double[] penalizacionFila = new double[n]; // Penalizaciones por fila
        double[] penalizacionColumna = new double[m]; // Penalizaciones por columna

        // Calcular penalizaciones por fila
        for (int i = 0; i < n; i++) {
            if (Of_flag[i]) { // Solo filas no satisfechas
                continue; }
                double min1 = Double.POSITIVE_INFINITY; // Menor que min2
                double min2 = Double.POSITIVE_INFINITY; // Mayor que min1
                for (int j = 0; j < m; j++) {
                    if (!De_flag[j]) { // Solo columnas no satisfechas
                        continue;}
                        if (MatrizCostos[i][j] < min1) {
                            min2 = min1; // Actualiza segundo mínimo
                            min1 = MatrizCostos[i][j]; // Actualiza mínimo
                        } else if (MatrizCostos[i][j] < min2) {
                            min2 = MatrizCostos[i][j];
                        }
                    
                }
                penalizacionFila[i] = min2 - min1; // Penalización = diferencia entre los dos menores
            
        }

        // Calcular penalizaciones por columna 
        for (int j = 0; j < m; j++) {
            if (!De_flag[j]) { // Solo columnas no satisfechas
                double min1 = Double.POSITIVE_INFINITY, min2 = Double.POSITIVE_INFINITY;
                for (int i = 0; i < n; i++) {
                    if (!Of_flag[i]) { // Solo filas no satisfechas
                        if (MatrizCostos[i][j] < min1) {
                            min2 = min1;
                            min1 = MatrizCostos[i][j];
                        } else if (MatrizCostos[i][j] < min2) {
                            min2 = MatrizCostos[i][j];
                        }
                    }
                }
                penalizacionColumna[j] = min2 - min1;
            }
        }

        double maxPenalizacion = -1;
        boolean esFila = true;

        // Verificar penalización máxima en filas
        for (int i = 0; i < n; i++) {
            if (!Of_flag[i] && penalizacionFila[i] > maxPenalizacion) {
                maxPenalizacion = penalizacionFila[i];
                Of = i;
                esFila = true;
            }
        }
        // Verificar penalización máxima en columnas
        for (int j = 0; j < m; j++) {
            if (!De_flag[j] && penalizacionColumna[j] > maxPenalizacion) {
                maxPenalizacion = penalizacionColumna[j];
                De = j;
                esFila = false;
            }
        }

        // Si la penalización máxima es de una fila, selecciona el menor costo en esa fila
        if (esFila) {
            double minCost = Double.POSITIVE_INFINITY;
            for (int j = 0; j < m; j++) {
                if (!De_flag[j] && MatrizCostos[Of][j] < minCost) {
                    minCost = MatrizCostos[Of][j];
                    De = j;
                }
            }
        } // Si la penalización máxima es de una columna, selecciona el menor costo en esa columna
        else {
            double minCost = Double.POSITIVE_INFINITY;
            for (int i = 0; i < n; i++) {
                if (!Of_flag[i] && MatrizCostos[i][De] < minCost) {
                    minCost = MatrizCostos[i][De];
                    Of = i;
                }
            }
        }
    }

    public void asignacion() {
        if (O[Of] > D[De]) { // Caso en que la oferta supera a la demanda
            O[Of] -= D[De];
            stage[Of][De] = D[De];
            D[De] = 0;
            De_flag[De] = true; // Marca la demanda como satisfecha
        } else { // Caso en que la demanda supera a la oferta
            D[De] -= O[Of];
            stage[Of][De] = O[Of];
            O[Of] = 0;
            Of_flag[Of] = true; // Marca la oferta como satisfecha
        }
    }

    public void vogel() {
        for (int k = 0; k < m + n - 1; k++) {
            penalizacion(); // Calcula penalizaciones
            asignacion(); // Realiza la asignación 
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

package Unidad2.metododetransporte;

public class ProblemaTransporte {

    private int m; // Cantidad de productores
    private int n; // Cantidad de consumidores
    private double[] o; // Datos oferta
    private double[] d; // Datos demanda
    private double[][] c; // Matriz costos
    private double[][] state; // Donde se guardarán los cambios

    public ProblemaTransporte(int m, int n) {
        this.m = m;
        this.n = n;
        this.state = new double[m][n];
    }

    public void setO(double[] o) {
        this.o = o;
    }

    public void setD(double[] d) {
        this.d = d;
    }

    public void setC(double[][] c) {
        this.c = c;
    }

    public void equilibrar() {

    }

    public void resolver() {
        int i = 0; // Índice para oferta
        int j = 0; // Índice para demanda

        while (i < m && j < n) {
            if (o[i] > d[j]) { // Si la oferta > demanda
                state[i][j] = d[j]; // Asignar toda la demanda
                o[i] = o[i] - d[j];
                d[j] = 0; // Demanda satisfecha
                j++; // Pasar a la siguiente columna
            } else { // Si la demanda > oferta
                state[i][j] = o[i]; // Asignar toda la oferta
                d[j] = d[j] - o[i];
                o[i] = 0; // Oferta agotada
                i++; // Pasar a la siguiente fila
            }
        }
    }

    public void getSolution() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(state[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

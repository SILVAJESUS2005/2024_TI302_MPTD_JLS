package Unidad2.metododetransporte;

public class ProblemaTransporteTest {
    public static void main(String[] args) {

 
        ProblemaTransporte test1 = new ProblemaTransporte(2, 3);
        
        double[] oferta = {60, 50, 40};
        double[] demanda = {40, 70, 10, 30 };

        test1.setO(oferta);
        test1.setD(demanda);
        
        test1.resolver();
        test1.getSolution();
    }
}

package testeMVC.model;

public class Subtracao {
    public String calcular(double d1, double d2) {
        double dResultado = 0;
        String msg = "";

        dResultado = d1 - d2;
        msg = "Resultado: " + dResultado;

        return msg;
    }
}

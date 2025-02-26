package c5;

public class Divisao {
    public String calcular(double d1, double d2) {

        double dResultado = 0;
        String msg = "";

        if (d2 != 0) {
            dResultado = d1 / d2;
            msg = "Resultado: " + dResultado;
        } else {
            dResultado = 0.0;
            msg = "Erro de divisão por zero";
        }
        return msg;
    }
}

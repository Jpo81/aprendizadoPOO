package c3;

public class Operacoes {
    public String calcular(char op, double d1, double d2) {
        String msg = "Invalido";

        double dResultado = 0;

        switch (op) {
            case '+':
                dResultado = d1 + d2;
                msg = "Resultado: " + dResultado;
                break;
            case '-':
                dResultado = d1 - d2;
                msg = "Resultado: " + dResultado;
                break;
            case '*':
                dResultado = d1 * d2;
                msg = "Resultado: " + dResultado;
                break;
            case '/':
                if (d2 != 0) {
                    dResultado = d1 / d2;
                    msg = "Resultado: " + dResultado;
                } else {
                    dResultado = 0.0;
                    msg = "Erro de divisão por zero";
                }
                break;
            default:
                msg = "Operação não implementada...";
                break;
        }
        return msg;
    }
}

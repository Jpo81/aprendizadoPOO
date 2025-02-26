package testeMVC.control;

import testeMVC.model.Divisao;
import testeMVC.model.Multiplicacao;
import testeMVC.model.Soma;
import testeMVC.model.Subtracao;

public class Controle {
    public String calcular(char op, double d1, double d2) {
        String msg = "";

        switch (op) {
            case '+':
                Soma soma = new Soma();
                msg = soma.calcular(d1, d2);
                break;
            case '-':
                Subtracao sub = new Subtracao();
                msg = sub.calcular(d1, d2);
                break;
            case '*':
                Multiplicacao mul = new Multiplicacao();
                msg = mul.calcular(d1, d2);
                break;
            case '/':
                Divisao div = new Divisao();
                msg = div.calcular(d1, d2);
                break;
            default:
                msg = "Operação não implementada...";
                break;
        }
        return msg;
    }
}

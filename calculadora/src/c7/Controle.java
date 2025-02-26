package c7;

public class Controle {
    public String calcular(char op, double d1, double d2) {
        String msg = "";

        switch (op) {
            case '+':
                Soma soma = new Soma();
                soma.ajustar(d1, d2);
                msg = soma.calcular();
                break;
            case '-':
                Subtracao sub = new Subtracao();
                sub.ajustar(d1, d2);
                msg = sub.calcular();
                break;
            case '*':
                Multiplicacao mul = new Multiplicacao();
                mul.ajustar(d1, d2);
                msg = mul.calcular();
                break;
            case '/':
                Divisao div = new Divisao();
                div.ajustar(d1, d2);
                msg = div.calcular();
                break;
            default:
                msg = "Operação não implementada...";
                break;
        }
        return msg;
    }
}

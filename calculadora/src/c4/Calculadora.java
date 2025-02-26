package c4;

import java.io.IOException;



public class Calculadora {
    public static void main(String[] args) throws IOException {

        EntradaSaida.coutln("Calculadora sem OO");

        char ch = ' ';

        while(true) {
            EntradaSaida.cout("Para sair digite s ou S: ");

            ch = EntradaSaida.cinch();

            if (ch == 'S' || ch == 's') break;

            EntradaSaida.cout("Digite o primeiro Numero: ");
            double d1 = EntradaSaida.cind();

            EntradaSaida.cout("Digite o segundo Numero: ");
            double d2 = EntradaSaida.cind();

            EntradaSaida.cout("Escolha a operação + - / * --> ");
            char op = EntradaSaida.cinch();

            String sResultado = calcular(op, d1, d2);

            EntradaSaida.coutln(sResultado);

        }
        EntradaSaida.coutln("Encerrado");
    }

    static public String calcular(char op, double d1, double d2) {

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
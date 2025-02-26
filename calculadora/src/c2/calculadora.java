package c2;

import java.io.IOException;



public class calculadora {
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
                    if (dResultado == 0) {
                        dResultado = d1 / d2;
                        msg = "Resultado: " + dResultado;
                    } else {
                        dResultado = 9.9;
                        msg = "Erro de divisão por zero";
                    }
                    break;
                default:
                    msg = "Operação não implementada...";
                    break;
            }
            EntradaSaida.coutln(msg);

        }
        EntradaSaida.coutln("Encerrado");
    }



}
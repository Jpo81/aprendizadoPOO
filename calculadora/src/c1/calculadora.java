package c1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class calculadora {
    public static void main(String[] args) throws IOException {

        coutln("Calculadora sem OO");

        char ch = ' ';

        while(true) {
            cout("Para sair digite s ou S: ");

            ch = cinch();

            if (ch == 'S' || ch == 's') break;

            cout("Digite o primeiro Numero: ");
            double d1 = cind();

            cout("Digite o segundo Numero: ");
            double d2 = cind();

            cout("Escolha a operação + - / * --> ");
            char op = cinch();

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
            coutln(msg);

        }
        coutln("Encerrado");
    }


    static void cout(String str) {
        System.out.print(str);
    }
    static void coutln(String str) {
        System.out.println(str);
    }
    static String cin() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        return str;
    }
    static double cind() throws IOException {
        String str = cin();
        double d = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == '.' || str.charAt(i) == '-') {
                i++;
                continue;
            } else return d;
        }
        d = Double.parseDouble(str);
        return d;
    }
    static char cinch() throws IOException {
        String str = cin();
        char ch = 'e';
        if (str.length() >= 1) {
            ch = str.charAt(0);
        }
        return ch;
    }
}
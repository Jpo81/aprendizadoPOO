package testandoConstrutores;

import java.io.IOException;

public class Interface {

    public void executar() throws IOException {
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


            Controle controle = new Controle();
            String sResultado = controle.calcular(op, d1, d2);

            EntradaSaida.coutln(sResultado);

        }
        EntradaSaida.coutln("Encerrado");
    }
}

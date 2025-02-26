/*
 *  Aqui eu utilizo uma forma de simplificar os construtores
 *  ao inves de criar um para cada subclasse da superclasse
 *  operacao eu crio um contrutor para a superclasse e outros
 *  construtores para as subclasses
 * */


package testandoConstrutores;

public class Operacao {
    protected  double m_d1;
    protected double m_d2;

    public Operacao(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
    }

    public Operacao() {
        m_d1 = 0;
        m_d2 = 0;
    }

    public void ajustar(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
    }

}

class Soma extends Operacao {

    public Soma(double d1, double d2) {
        super(d1, d2);
    }

    public Soma() {
        super();
    }

    public String calcular() {
        double dResultado = 0;
        String msg = "";

        dResultado = m_d1 + m_d2;
        msg = "Resultado: " + dResultado;

        return msg;
    }

}

class Subtracao extends Operacao {

    public Subtracao(double d1, double d2) {
        super(d1, d2);
    }

    public Subtracao() {
        super();
    }

    public String calcular() {
        double dResultado = 0;
        String msg = "";

        dResultado = m_d1 - m_d2;
        msg = "Resultado: " + dResultado;

        return msg;
    }
}

class Divisao extends Operacao{

    public Divisao(double d1, double d2) {
        super(d1, d2);
    }

    public Divisao() {
        super();
    }

    public String calcular() {

        double dResultado = 0;
        String msg = "";

        if (m_d2 != 0) {
            dResultado = m_d1 / m_d2;
            msg = "Resultado: " + dResultado;
        } else {
            dResultado = 0.0;
            msg = "Erro de divisão por zero";
        }
        return msg;
    }
}

class Multiplicacao extends Operacao {

    public Multiplicacao(double d1, double d2) {
        super(d1, d2);
    }

    public Multiplicacao() {
        super();
    }

    public String calcular() {
        double dResultado = 0;
        String msg = "";

        dResultado = m_d1 * m_d2;
        msg = "Resultado: " + dResultado;

        return msg;
    }
}









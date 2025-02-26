package c7;

public class Operacao {
    protected  double m_d1;
    protected double m_d2;

    public void ajustar(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
    }
}

class Soma extends Operacao {

    public Soma() {
        m_d1 = 0;
        m_d2 = 0;
    }

    public Soma(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
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

    public Subtracao() {
        m_d1 = 0;
        m_d2 = 0;
    }

    public Subtracao(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
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

    public Divisao() {
        m_d1 = 0;
        m_d2 = 0;
    }

    public Divisao(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
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

    public Multiplicacao() {
        m_d1 = 0;
        m_d2 = 0;
    }

    public Multiplicacao(double d1, double d2) {
        m_d1 = d1;
        m_d2 = d2;
    }

    public String calcular() {
        double dResultado = 0;
        String msg = "";

        dResultado = m_d1 * m_d2;
        msg = "Resultado: " + dResultado;

        return msg;
    }
}
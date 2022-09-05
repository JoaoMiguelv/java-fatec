package atividade01;

public class Numero {

    public Numero(int x) {
        setX(x);
        System.out.println("VALOR INICIAL: " + x + "\n");
    }

    public int getX() {
        return x;
    }

    private void setX(int valor) {
        this.x = valor;
    }

    public void somar(int valor) {
        x = getX();
        int soma = valor + x;
        System.out.println("SOMA: " + x + " + " + valor + " = " + soma);
        System.out.println("------------------------------");
        setX(soma);
    }

    public void subtrair(int valor) {
        x = getX();
        int subtracao = x - valor;
        System.out.println("SUBTRACAO: " + x + " - " + valor + " = " + subtracao);
        System.out.println("------------------------------");
        setX(subtracao);
    }

    public void multiplicar(int valor) {
        x = getX();
        int multiplicacao = x * valor;
        System.out.println("MULTIPLICACAO: " + x + " * " + valor + " = " + multiplicacao);
        System.out.println("------------------------------");
        setX(multiplicacao);
    }

    public void dividir(int valor) {
        x = getX();
        int divisao = x / valor;
        System.out.println("DIVISAO: " + x + " / " + valor + " = " + divisao);
        System.out.println("------------------------------");
        setX(divisao);
    }

    // atributos => caracteristicas
    private int x;
}

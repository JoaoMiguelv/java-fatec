package atividade01;

public class Calculadora {
    public static void main(String[] args) {
        Numero n1 = new Numero(5);
        Numero n2 = new Numero(2);

        System.out.println("########################");
        n1.somar(5);
        n1.subtrair(2);
        n1.multiplicar(3);
        n1.dividir(2);

        System.out.println("########################");
        n2.somar(10);
        n2.subtrair(5);
        n2.multiplicar(2);
        n2.dividir(2);

    }
}

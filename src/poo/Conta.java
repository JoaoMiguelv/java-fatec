package poo;

public class Conta {
    public Conta(int numero, String dono) {
        System.out.println("Criar objeto Conta");
        setNumero(numero);
        setDono(dono);
        setLimite(1500);
    }

    // Atributos => caracteristicas
    private int numero;
    private double saldo;
    private String dono;
    private double limite;

    // Comportamentos / Métodos => ações
    // tipo_retorno nome_metodo(tipo_parametro nome_parametro)
    private String info() {
        String estado = "Número: " + numero + " // Saldo R$: " + saldo + " // Dono: " + dono + " // Limite R$: " + limite;
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return info();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}

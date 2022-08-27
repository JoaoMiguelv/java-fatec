package poo;

import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String[] args) {
        Conta objCC = new Conta(1111, "João");
        Conta objCP = new Conta(2222, "Maria");
        Conta objCV = new Conta(3333, "Pedro");

        // objCC.setNumero(333);
        objCC.setSaldo(2395.00);
        objCC.setLimite(5000.00);

        // objCP.setNumero(555);
        objCP.setSaldo(6000);
        objCP.setLimite(7000);

        objCV.setSaldo(2000);
        objCV.setLimite(3000);

        System.out.println(objCC.toString());
        JOptionPane.showMessageDialog(null, objCP.toString());

        System.out.println("-------------- REFERÊNCIA --------------");
        System.out.println(objCC);
        System.out.println(objCP);
        System.out.println(objCV);
    }
}

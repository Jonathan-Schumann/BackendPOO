package src;

import src.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso banco digital");
        System.out.println();

        ContaBancaria conta1 = new ContaBancaria("0542", "2547", 1, 100.0);
        System.out.println("Saldo atual de R$" + conta1.getSaldo());

        conta1.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta1.getSaldo());

        var saque = conta1.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta1.getSaldo());
        System.out.println(saque);

    }
}

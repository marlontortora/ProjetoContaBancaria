package br.unipar;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(1000d);
        System.out.println("saldo é :" +contaCorrente.obterSaldo());
        System.out.println("numero da conta é " +contaCorrente);
    }
}

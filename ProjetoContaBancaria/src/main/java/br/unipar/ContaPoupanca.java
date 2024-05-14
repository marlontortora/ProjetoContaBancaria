package br.unipar;


public class ContaPoupanca extends HerancaContaBancaria {
    @Override
    public boolean saque(Double valor) {

        if (saldo >= valor){
            saldo -= valor - 5;
            return true;
        }
        return false;
    }
}

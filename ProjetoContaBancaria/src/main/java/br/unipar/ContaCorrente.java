package br.unipar;

public class ContaCorrente extends HerancaContaBancaria{
    @Override
    public boolean saque(Double valor) {

        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
}

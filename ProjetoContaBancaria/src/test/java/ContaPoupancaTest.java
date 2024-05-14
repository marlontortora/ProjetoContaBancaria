import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {
    @Test
    public void testDepositoContaPoupanca(){

        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar (5000d);

        assertEquals(conta.obterSaldo(), 5000d);
    }

    @Test
    public void testSaqueContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar (2995d);
        boolean  validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(1500, conta.obterSaldo());

    }

    @Test
    public void testSaqueMaiorQueSaldoContaCorrente(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar (3000d);
        boolean  validacao = conta.saque(4500d);

        assertTrue(validacao);
        assertEquals(1500, conta.obterSaldo());

    }
}

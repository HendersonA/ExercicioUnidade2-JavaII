package Conta.teste;

import junit.framework.TestCase;
import Conta.Conta;
import Conta.ContaPoupanca;

public class ContaPoupancaTeste extends TestCase{
	
	Conta conta = new ContaPoupanca();
	Conta conta1 = new ContaPoupanca();
	
	public void testeCreditar(){		
		conta.setSaldo(100.0);
		conta.creditar(50.0);
		assertEquals(150.0, conta.getSaldo());
	}
	public void testeDebitar(){
		conta.setSaldo(100.0);
		conta.debitar(50.0);
		assertEquals(50.0,conta.getSaldo());
	}
	public void testeFalse(){
		assertFalse(conta.getSaldo()==10);
	}
	public void testeTrue(){
		assertTrue(conta1.getSaldo()==0);
	}
	public void testeNotNull(){
		assertNotNull(conta);
	}
	public void testeNull(){
		assertNull(conta1);	
	}
	public void testeNotSame(){
		assertNotSame(conta, conta1);
	}
	public void testeSame(){
		assertSame(conta, conta);
	}
	public void testeFail(){
		fail();
	}
}

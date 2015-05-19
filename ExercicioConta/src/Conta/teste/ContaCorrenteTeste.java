package Conta.teste;

import Conta.Conta;
import Conta.ContaCorrente;
import junit.framework.TestCase;

public class ContaCorrenteTeste extends TestCase{
	
	Conta conta = new ContaCorrente();
	Conta conta1 = new ContaCorrente();
	
	public void testeCreditar(){		
		conta.setSaldo(100.0);
		conta.creditar(50.0);
		assertEquals(150.0, conta.getSaldo());
	}
	public void testeDebitar(){
		conta.setSaldo(100.0);
		conta.debitar(50.0);
		assertEquals(51.0,conta.getSaldo());
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

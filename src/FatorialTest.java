import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FatorialTest {
	
	/** Testa o Fatorial do número zero(0), pois é um caso especial, visto que o cálculo de fatorial
	 se dá pela multiplicação do número escolhido por todos os seus antecessores, até chegar em 1 **/
	@Test
    public void testeValido1() {
		Fatorial f = new Fatorial();
        int esperado = 1;
        int atual = f.fat(0);
        assertEquals(esperado, atual);
    }

	
	//Testa o Fatorial do número um(1) pois é um caso especial, assim como o zero(0)
    @Test
    public void testeValido2() {
    	Fatorial f = new Fatorial();
        int esperado = 1;
        int atual = f.fat(1);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do número dois(2) apenas para ver se está funcionando como esperado
    @Test
    public void testeValido3() {
    	Fatorial f = new Fatorial();
        int esperado = 2;
        int atual = f.fat(2);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do número sete(7) apenas para ver se está funcionando como esperado
    @Test
    public void testeValido4() {
    	Fatorial f = new Fatorial();
        int esperado = 5040;
        int atual = f.fat(7);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do número dez(10) para ver se ao inserir um número um pouco maior, o resultado será como esperado
    @Test
    public void testeValido5() {
    	Fatorial f = new Fatorial();
        int esperado = 3628800;
        int atual = f.fat(10);
        assertEquals(esperado, atual);
    }
    
    
    @Test
    public void testeValido6() {
    	Fatorial f = new Fatorial();
        int esperado = 479001600;
        int atual = f.fat(12);
        assertEquals(esperado, atual);
    }
    
 
    /** Testa o Fatorial de um número negativo, no caso abaixo, representado pelo número -1, pois o cáculo de fatorial
     é realizado apenas com números positivos. Caso seja inserido um número negativo, uma exceção será gerada **/
    @Test(expected = IllegalArgumentException.class)
    public void testeExcecao1() {
    	Fatorial f = new Fatorial();
        f.fat(-1);
    }
    
    
    /** Testa o Fatorial de um número negativo um pouco maior do que o caso anterior, apenas para ver se o resultado será
    como esperado **/
    @Test(expected = IllegalArgumentException.class)
    public void testeExcecao2() {
    	Fatorial f = new Fatorial();
        f.fat(-7);
    }
}



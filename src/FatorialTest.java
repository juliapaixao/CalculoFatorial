import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FatorialTest {
	
	/** Testa o Fatorial do n�mero zero(0), pois � um caso especial, visto que o c�lculo de fatorial
	 se d� pela multiplica��o do n�mero escolhido por todos os seus antecessores, at� chegar em 1 **/
	@Test
    public void testeValido1() {
		Fatorial f = new Fatorial();
        int esperado = 1;
        int atual = f.fat(0);
        assertEquals(esperado, atual);
    }

	
	//Testa o Fatorial do n�mero um(1) pois � um caso especial, assim como o zero(0)
    @Test
    public void testeValido2() {
    	Fatorial f = new Fatorial();
        int esperado = 1;
        int atual = f.fat(1);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do n�mero dois(2) apenas para ver se est� funcionando como esperado
    @Test
    public void testeValido3() {
    	Fatorial f = new Fatorial();
        int esperado = 2;
        int atual = f.fat(2);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do n�mero sete(7) apenas para ver se est� funcionando como esperado
    @Test
    public void testeValido4() {
    	Fatorial f = new Fatorial();
        int esperado = 5040;
        int atual = f.fat(7);
        assertEquals(esperado, atual);
    }
    
    
    //Testa o Fatorial do n�mero dez(10) para ver se ao inserir um n�mero um pouco maior, o resultado ser� como esperado
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
    
 
    /** Testa o Fatorial de um n�mero negativo, no caso abaixo, representado pelo n�mero -1, pois o c�culo de fatorial
     � realizado apenas com n�meros positivos. Caso seja inserido um n�mero negativo, uma exce��o ser� gerada **/
    @Test(expected = IllegalArgumentException.class)
    public void testeExcecao1() {
    	Fatorial f = new Fatorial();
        f.fat(-1);
    }
    
    
    /** Testa o Fatorial de um n�mero negativo um pouco maior do que o caso anterior, apenas para ver se o resultado ser�
    como esperado **/
    @Test(expected = IllegalArgumentException.class)
    public void testeExcecao2() {
    	Fatorial f = new Fatorial();
        f.fat(-7);
    }
}



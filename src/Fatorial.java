//Programa que calcula fatorial de um n�mero

public class Fatorial {
	
	public int fat(int num) { 
		
		if (num < 0) {
			throw new IllegalArgumentException("C�lculo n�o pode ser realizado com n�mero negativo.");
		}
		
		else{
			int resultado_fatorial = 1;
			for (int cont; num>1; num--) {
				resultado_fatorial = resultado_fatorial * num;
		}
			return resultado_fatorial;
		}
	}
}
	
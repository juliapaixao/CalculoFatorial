//Programa que calcula fatorial de um número

public class Fatorial {
	
	public int fat(int num) { 
		
		if (num < 0) {
			throw new IllegalArgumentException("Cálculo não pode ser realizado com número negativo.");
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
	
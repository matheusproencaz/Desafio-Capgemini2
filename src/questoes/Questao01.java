package questoes;

import java.util.Arrays;

public class Questao01 {

	public static void main(String[] args) {

		int[] numeros = {15,20,5,1,5,9,43,2,52,100,38,49};
		
		System.out.println(mediana(numeros));
	}

	public static double mediana(int[] numeros) {
		Arrays.sort(numeros);
		
		int n = numeros.length / 2;
		double resultado = 0;
		
		if(numeros.length % 2 == 0) {
			resultado = (numeros[n] + numeros[n - 1])/2.0;
			return resultado;	
		} else {
			resultado = (numeros[n]);
			return resultado;
		}
	}
}
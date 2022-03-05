package questoes;

import java.util.Arrays;

/* Classe da Questão 1 do segundo Desafio de programação para a Academia Capgemini.
* @author: Matheus Proença.
*/
public class Questao01 {

	public static void main(String[] args) {
		int[] vetor = {15, 20, 5, 1, 5, 9, 43, 2, 52, 100, 38, 49};
		System.out.println(mediana(vetor));
	}
	/* Método para gerar a mediana de um vetor com tratamento de excessões, podendo o tamanho do vetor 
	 * ser par ou ímpar. É utilizado o método sort() da classe Arrays do java para ordernar o vetor.
	 * 
	 * @param int[] vetor
	 * @return int vetor[n]
	 */
	public static double mediana(int[] vetor) {
		try {
		Arrays.sort(vetor);
		int n = vetor.length / 2;

		if (vetor.length % 2 == 0) {
			return (vetor[n] + vetor[n - 1]) / 2.0;
		} else {
			return (vetor[n]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			return 0;
		}catch(NullPointerException e) {
			return 0;
		}
	}
}
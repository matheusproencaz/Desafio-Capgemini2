package questoes;

import java.util.Arrays;

/* Classe da Quest�o 1 do segundo Desafio de programa��o para a Academia Capgemini.
* @author: Matheus Proen�a.
*/
public class Questao01 {

	public static void main(String[] args) {
		int[] vetor = {15, 20, 5, 1, 5, 9, 43, 2, 52, 100, 38, 49};
		System.out.println(mediana(vetor));
	}
	/* M�todo para gerar a mediana de um vetor com tratamento de excess�es, podendo o tamanho do vetor 
	 * ser par ou �mpar. � utilizado o m�todo sort() da classe Arrays do java para ordernar o vetor.
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
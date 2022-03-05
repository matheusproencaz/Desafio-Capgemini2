package questoes;

/* Classe da Questão 2 do segundo Desafio de programação para a Academia Capgemini.
* @author: Matheus Proença. 
*/ 
public class Questao02 {

	public static void main(String[] args) {

		int[] n = {1,5,3,4,2};
		int x = 2;

		System.out.println(pares(n, x));
	}

	/* Método que retorna a quantidade de pares com diferença de N números de um vetor. O método abs da class Math
	 * do Java retorna o valor absoluto.
	 * 
	 * @param int[] vetor, int numero.
	 * @return int contador.
	 */
	public static int pares(int[] vetor, int numero) {
		try {
			int contador = 0;

			for (int i = 0; i < vetor.length; i++) {
				for (int j = 0; j < i; j++) {
					if ((Math.abs(vetor[i] - vetor[j]) == numero) && i != j) {
						contador++;
					}
				}
			}
			return contador;
		} catch (NullPointerException e) {
			return 0;
		}
	}
}
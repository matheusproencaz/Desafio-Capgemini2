package questoes;

/* Classe da Quest�o 2 do segundo Desafio de programa��o para a Academia Capgemini.
* @author: Matheus Proen�a. 
*/ 
public class Questao02 {

	public static void main(String[] args) {

		int[] n = {1,5,3,4,2};
		int x = 2;

		System.out.println(pares(n, x));
	}

	/* M�todo que retorna a quantidade de pares com diferen�a de N n�meros de um vetor. O m�todo abs da class Math
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
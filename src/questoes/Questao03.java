package questoes;

/* Classe da Quest�o 3 do segundo Desafio de programa��o para a Academia Capgemini.
* @author: Matheus Proen�a.
*/
public class Questao03 {
	
	public static void main(String[] args) {

		String str = "ola mundo";

		System.out.println(encriptacao(str));
	}
	/* M�todo de ecripta��o de uma string, que retira os espa�os da frase, passa todas as letras da frase para uma matriz,
	 * com tamanho baseado na raiz quadrada do comprimento da frase sem os espa�os, � utilizado os m�todos sqrt, que gerar 
	 * a raiz quadrada de um valor e ceil que retorna o valor arredondado para cima da classe Math do Java com tratamento de excess�es. 
	 * 
	 * @param String str
	 * @return String matriz
	 */
	public static String encriptacao(String str) {
		try {
			String temp = str.replace(" ", "");
			int raizT = (int) Math.ceil(Math.sqrt(temp.length()));
			char[][] matriz = new char[raizT][raizT];

			int contador = 0;

			for (int i = 0; i < raizT; i++) {
				for (int j = 0; j < raizT; j++) {
					if (temp.length() >= contador + 1) {
						matriz[i][j] = temp.charAt(contador);
						contador++;
					} else {
						matriz[i][j] = ' ';
					}
				}
			}
			return escreverStringComMatriz(transporMatriz(matriz));
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Voc� digitou uma string sem conte�do";
		} catch (NullPointerException e) {
			return "Voc� digitou uma string nula";
		}
	}

	/* M�todo que transp�em uma matriz de caracteres.
	 * 
	 * @param char[][] matriz.
	 * @return char[][] matriz.
	 */
	public static char[][] transporMatriz(char[][] matriz) {
		char[][] matrizTransposta = new char[matriz.length][matriz[0].length];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		return matrizTransposta;
	}

	/* M�todo que recebe uma matriz a trancreve para uma string.
	 * 
	 * @param char[][] matriz.
	 * @return String.
	 */
	public static String escreverStringComMatriz(char[][] matriz) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != ' ') {
					sb.append(matriz[i][j]);
				}
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
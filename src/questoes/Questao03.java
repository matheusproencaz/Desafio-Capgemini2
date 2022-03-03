package questoes;

public class Questao03 {

	public static void main(String[] args) {
	
		String str = "tenha um bom dia";
			
		System.out.println(encriptacao(str));
	}
	
	public static String encriptacao(String str) {
		String temp;
		temp = str.replace(" ", "");
		int raizT = (int) Math.ceil(Math.sqrt(temp.length()));
		char[][] grid = new char[raizT][raizT]; 

		int cont = 0;
		
		for(int i = 0; i < raizT; i++) {
			for(int j = 0; j < raizT; j++) {
				
				if(temp.length() >= cont+1) {
					grid[i][j] = temp.charAt(cont);
					cont++;
				}else {
					grid[i][j] = ' ';
				}
			}
		}
		//System.out.println("GRID: "+Arrays.deepToString(grid));
		return escreverStringComMatriz(transporMatriz(grid, raizT, raizT));
	}
	
	public static char[][] transporMatriz(char[][] matriz, int linha, int coluna){
		
		char[][] matrizTransposta = new char[coluna][linha];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}
		System.out.println();
		//System.out.println("MATRIZT: "+Arrays.deepToString(matrizTransposta));
		//Arrays.stream(matrizTransposta).forEach(System.out::println);
		return matrizTransposta;
	}
	
	public static String escreverStringComMatriz(char[][] matriz) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] != ' ') {
					sb.append(matriz[i][j]);
				}
			}
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	//Contar espaços em branco na matriz com pattern;
}
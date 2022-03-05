package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Questao01;

/* Classe de testes da primeira quest�o.
 * @author: Matheus Proen�a. 
 */
class TesteQuestao01 {

	@Test
	void deveriaRetornar0() {
		Questao01 q1 = new Questao01();
		assertEquals(0, q1.mediana(new int[] {}));
	}
	
	@Test
	void deveriaRetornar4() {
		Questao01 q1 = new Questao01();
		assertEquals(4, q1.mediana(new int[] {9,2,1,4,6}));
	}
	
	@Test
	void deveriaRetornar17ponto5() {
		Questao01 q1 = new Questao01();
		assertEquals(17.5, q1.mediana(new int[] {15,20,5,1,5,9,43,2,52,100,38,49}));
	}
	
	@Test
	void deveriaRetornar9() {
		Questao01 q1 = new Questao01();
		assertEquals(9, q1.mediana(new int[] {3,1,6,12,52,36,46,37,7,5,9}));
	}
	
	@Test
	void deveriaRetornar0Nulo() {
		Questao01 q1 = new Questao01();
		assertEquals(0, q1.mediana(null));
	}
	
}
package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Questao02;

public class TesteQuestao02 {

	@Test
	void deveriaRetornar3() {
		Questao02 q2 = new Questao02();
		assertEquals(3, q2.pares(new int[] {1,5,3,4,2}, 2));
	}

	@Test
	void deveriaRetornar2() {
		Questao02 q2 = new Questao02();
		assertEquals(2, q2.pares(new int[] {1,5,3,4,2}, 3));
	}
	
	@Test
	void deveriaRetornar1() {
		Questao02 q2 = new Questao02();
		assertEquals(1, q2.pares(new int[] {9,7,3,3,8}, 2));
	}
}
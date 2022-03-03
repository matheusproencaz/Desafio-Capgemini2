package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Questao03;

public class TesteQuestao03 {

	@Test
	void deveriaRetornarString1() {
		Questao03 q3 = new Questao03();
		assertEquals("omd luo an", q3.encriptacao("ola mundo"));
	}
	
	@Test
	void deveriaRetornarString2() {
		Questao03 q3 = new Questao03();
		assertEquals("taoa eum nmd hbi", q3.encriptacao("tenha um bom dia"));
	}
	
	@Test
	void deveriaRetornarString3() {
		Questao03 q3 = new Questao03();
		assertEquals("merç auoa tse hpn", q3.encriptacao("matheus proença"));
	}
	
}

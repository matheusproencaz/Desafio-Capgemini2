package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import questoes.Questao03;

/* Classe de testes da terceira quest�o.
 * @author: Matheus Proen�a. 
 */
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
		assertEquals("mer� auoa tse hpn", q3.encriptacao("matheus proen�a"));
	}
	
	@Test
	void deveriaRetornarErro01() {
		Questao03 q3 = new Questao03();
		assertEquals("Voc� digitou uma string nula", q3.encriptacao(null));
	}
	
	@Test
	void deveriaRetornarErro02() {
		Questao03 q3 = new Questao03();
		assertEquals("Voc� digitou uma string sem conte�do", q3.encriptacao(""));
	}
	
}

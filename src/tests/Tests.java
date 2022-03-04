package tests;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import questoes.Questao1;
import questoes.Questao2;
import questoes.Questao3;

/**
 * Classe que apresenta os métodos computacionais que testam os programas implementados referentes às questões 1, 2 e 3 do Desafio de Programação 02.
* @author Saulo de Társio
* @version 1.00
* @since 02 de mar 17:30
*/
public class Tests extends TestCase{
	
	//Testes da Questão 1 começam aqui
	
	/**
	 * Método que realiza testes sobre o programa implementado referente à questão 1 do Desafio de Programação 02.
	 * O teste consiste em definir conjuntos de lista de números e verificar se o retorno da mediana é correto.
	 */
	public void testQuestao1() {
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		assertEquals(Questao1.definir_mediana(numeros), 2);
		
		numeros = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 5, 5));
		assertEquals(Questao1.definir_mediana(numeros), 3);
		
		numeros = new ArrayList<Integer>(Arrays.asList(10, 12, 4, 1, 2, 3, 2, 3, 5, 5, 8));
		assertEquals(Questao1.definir_mediana(numeros), 4);
		
		numeros = new ArrayList<Integer>(Arrays.asList(10));
		assertEquals(Questao1.definir_mediana(numeros), 10);
		
		numeros = new ArrayList<Integer>(Arrays.asList(10, 6, 4));
		assertEquals(Questao1.definir_mediana(numeros), 6);
		
		numeros = new ArrayList<Integer>(Arrays.asList(10, 6, 4, 1, 5));
		assertEquals(Questao1.definir_mediana(numeros), 5);
	}
	
	//Testes da Questão 2 começam aqui
	/**
	 * Método que realiza testes sobre o programa implementado referente à questão 2 do Desafio de Programação 02.
	 * O teste consiste em definir conjuntos de lista de números quantos pares possui em relação ao valor x passado como parâmetro.
	 */
	public void testQuestao2() {
		int a1[] = {1, 2};
		assertEquals(Questao2.calcular_pares(a1, 1), 1);
		
		int a2[] = {1, 2};
		assertEquals(Questao2.calcular_pares(a2, -1), 1);
		
		int a3[] = {9, 2, 1, 4, 6, 8};
		assertEquals(Questao2.calcular_pares(a3, 7), 2);
		
		int a4[] = {1, 5, 3, 4, 2};
		assertEquals(Questao2.calcular_pares(a4, 2), 3);
		
		int a5[] = {1, 5, 9, 6, 3, 2};
		assertEquals(Questao2.calcular_pares(a5, 3), 3);
		
		int a6[] = {1, -1, 10, 2, 5, 6, 7};
		assertEquals(Questao2.calcular_pares(a6, 1), 3);
		
		int a7[] = {1, -1, 10, 2, 5, 6, 7, 8, 9};
		assertEquals(Questao2.calcular_pares(a7, 1), 6);
		
		int a8[] = {8, 16, 24, 32, 40};
		assertEquals(Questao2.calcular_pares(a8, 8), 4);
		
		int a9[] = {6, 2, 3, 8, 13, 9, 5, 10};
		assertEquals(Questao2.calcular_pares(a9, 5), 3);
		
		int a10[] = {8, 10, 12, 6, 5, 3};
		assertEquals(Questao2.calcular_pares(a10, 2), 4);
		
		int a11[] = {2};
		assertEquals(Questao2.calcular_pares(a11, 2), 0);
		
		int a12[] = {};
		assertEquals(Questao2.calcular_pares(a12, 2), 0);
		
	}
	
	//Testes da Questão 3 começam aqui
	/**
	 * Método que realiza testes sobre o programa implementado referente à questão 3 do Desafio de Programação 02.
	 * O teste consiste em verificar se o método encripta corretamente o texto passado via parâmetro para a função implementada. 
	 */
	public void testQuestao3() {
		assertEquals(Questao3.gerar_texto_encriptado("ola mundo"), "omd luo an");
		assertEquals(Questao3.gerar_texto_encriptado("tenha um bom dia"), "taoa eum nmd hbi");
		assertEquals(Questao3.gerar_texto_encriptado("era uma casa muito engraçada"), "eameç rcuna aaigd ustra maoa");
		assertEquals(Questao3.gerar_texto_encriptado("bom dia"), "bd oi ma");
		assertEquals(Questao3.gerar_texto_encriptado("eu me chamo Saulo de Tarsio"), "ehaei uauTo mmla eoor cSds");
		
	}
		
	
	
}

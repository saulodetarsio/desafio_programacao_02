package questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Classe que apresenta os métodos computacionais que resolvem a Questão 1 do Desafio de Programação 02.
* @author Saulo de Társio
* @version 1.00
* @since 03 de mar 17:00
*/
public class Questao1 {
	
	/**
	 * Função que recebe uma lista de números informada pelo usuário. A lista deve conter um número impar de elementos.
	 * A função ordena a lista em ordem crescente e a partir disso, pega o elemento que está no meio da lista, definido como a mediana.
	 * 
	 * @param lista_numeros Uma lista de números informada pelo usuário.
	 * @return mediana
	 */
	public static int definir_mediana(ArrayList<Integer> lista_numeros) {
		//Ordenação da lista
		Collections.sort(lista_numeros);
		//O indice do meio da lista
		int index = lista_numeros.size()/2;
		//A mediana
		int mediana =  lista_numeros.get(index);
		return mediana;
	}
	
	/**
	 * Método principal. Ele é responsável por adquirir os dados do usuário via teclado e executar as rotinas
	 * implementadas para resolver a primeira questão do Desafio de Programação 02.
	 * @param args Argumentos para o método main.
	 */
	public static void main(String [] args) {
		
		//Para a leitura de dados via teclado
		Scanner s = new Scanner(System.in);
		//A lista de números
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//O usuário quer continuar ou não
		int opcao = 0;
		
		//Pedindo as informações ao usuário até ele 
		do{
			System.out.print("Informe um valor inteiro para ser adicionado à lista: ");
			int num = s.nextInt();
			numeros.add(num);
			if(numeros.size() % 2 != 0) {
				System.out.print("Você tem uma quantidade ímpar de elementos. ");
				System.out.println("Deseja continuar informando números?");
				System.out.print("Tecle 0 para prosseguir com o programa ou qualquer outro número para continuar inserindo valores: ");
				opcao = s.nextInt();
			}
		}while(opcao != 0);
		
		//fechando Scannner
		s.close();
		System.out.println("");
		int mediana = definir_mediana(numeros);
		System.out.println(mediana);
	}
}

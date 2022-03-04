package questoes;

import java.util.Scanner;

/**
 * Classe que apresenta os métodos computacionais que resolvem a Questão 2 do Desafio de Programação 02.
* @author Saulo de Társio
* @version 1.00
* @since 03 de mar 18:05
*/
public class Questao2 {
	
	/**
	 * Essa função iterage sobre a lista de números informados pelo usuário. Faz uma combinação par a par entre os elementos e
	 * verifica se a diferença entre eles resulta no número x passado via parâmetro, contando um par. Ao final, a função retorna o número
	 * de pares presentes na lista informada.
	 * 
	 * @param lista_numeros Um array que contém apenas os números informados pelo usuário.
	 * @param x  Número que representa a diferença exigida para a formação dos pares.
	 * @return numero_pares
	 */
	public static int calcular_pares(int lista_numeros[], int x) {
		int numero_pares = 0;
		
		//Faz a combinação par a par do elementos e verifica se a diferença resulta em x
		for(int i = 0; i < lista_numeros.length; i++) {
			for(int j=i+1; j < lista_numeros.length; j++) {
				
				//Da esquerda para a direita
				if(lista_numeros[i] - lista_numeros[j] == x) {
					numero_pares++;
				}
				//Da direita para a esquerda
				if(lista_numeros[lista_numeros.length-1-i] - lista_numeros[lista_numeros.length-1-j] == x) {
					numero_pares++;
				}
			}
		}
		
		return numero_pares;
	}
	
	/**
	 * Esse método é responsável por adquirir um vetor contendo os valores informados pelo usuário.
	 * Esses valores estão numa lista que tem tamanho de 50, por padrão. O objetivo da função  é receber
	 * a lista, o valor de x e o número de elementos que foi informado pelo usuário. Essa função invoca a rotina 
	 * que irá calcular o número de pares presentes na lista.
	 * 
	 * @param lista_numeros Um vetor de números inteiros informado pelo usuário. Esse vetor tem tamanho de 50 elementos.
	 * @param x Número que representa a diferença exigida para a formação dos pares.
	 * @param quant_elementos número de elementos informados pelo usuário.
	 * 
	 * @return quant_pares
	 */
	public static int preparar_calculo_pares(int lista_numeros[], int x, int quant_elementos) {
		int quant_pares = 0;
		int nova_lista[] = new int [quant_elementos];
		
		//Criando uma nova lista contendo apenas o elementos informados pelo usuário
		for(int i = 0; i < quant_elementos; i++) {
			nova_lista[i] = lista_numeros[i];
		}
		
		//Chama a função que calcula o número de pares
		quant_pares = calcular_pares(nova_lista, x);
		return quant_pares;
	}
	
	
	/**
	 * Método principal. Ele é responsável por adquirir os dados do usuário via teclado e executar as rotinas
	 * implementadas para resolver a segunda questão do Desafio de Programação 02.
	 * @param args Argumentos para o método main.
	 */
	public static void main(String [] args) {
		
		//Para a leitura de dados via teclado
		Scanner s = new Scanner(System.in);
		//Quantidade máxima de 50 valores na lista
		int numeros[] = new int[50];
		//O usuário quer continuar ou não
		int opcao = 0;
		int i = 0;
		
		//Pedindo dados ao usuário até ele digitar 0 para ver o número de pares
		do {
			System.out.print("Informe um valor: ");
			int num = s.nextInt();
			numeros[i] = num;
			i++;
			System.out.println("Deseja inserir novo elemento no vetor?");
			System.out.print("1 - Sim ou 0 - Não: ");
			opcao = s.nextInt();
		}while(opcao != 0);
		
		System.out.println();
		System.out.print("Informe o valor de x: ");
		int x = s.nextInt();
		
		s.close(); //Fechando Scannser
		
		int numero_pares = preparar_calculo_pares(numeros, x , i);
		System.out.println(numero_pares);
		
	}
}

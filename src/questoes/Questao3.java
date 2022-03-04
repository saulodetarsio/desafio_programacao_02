package questoes;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que apresenta os métodos computacionais que resolvem a Questão 3 do Desafio de Programação 02.
* @author Saulo de Társio
* @version 1.00
* @since 03 de mar 22:15
*/
public class Questao3 {
	
	/**
	 * Função que recebe o texto informado pelo usuário e gera uma lista de substrings a partir dele.
	 * Essa lista é referente à grid exibida na questão.
	 * @param texto O texto informado pelo usuário.
	 * @return lista_substrings
	 */
	public static ArrayList<String> gerar_substring_texto(String texto) {
		ArrayList<String> lista_substrings = new ArrayList<String>();
		int tamanho_texto = texto.length();
		int tamanhoUp = (int) Math.ceil(Math.sqrt(tamanho_texto));
		int tamanhoDown = (int) Math.floor(Math.sqrt(tamanho_texto));
		int ordemGrid = 0;
		
		//Especificando a ordem da grid
		if(tamanhoDown * tamanhoDown >= tamanho_texto) {
			ordemGrid = tamanhoDown;
		}else {
			ordemGrid = tamanhoUp;
		}
		
		//Monta as substrings presentes no texto
		for(int i=0; i < ordemGrid; i++) {
			int lim_inf = i * ordemGrid;
			int lim_sup = ordemGrid*(i+1);
			
			//quebra o laço se os limite inferior já o tamanho do texto
			if(lim_inf >= tamanho_texto) {
				break;
			}
			
			//Se o limite superior é maior que o tamanho da string, ele é redefinido como sendo o tamanho do texto
			if(lim_sup >= tamanho_texto) {
				lim_sup = tamanho_texto;
			}
			//System.out.println("Subs: "+texto.substring(lim_inf, lim_sup));
			lista_substrings.add(texto.substring(lim_inf, lim_sup));
		}
		return lista_substrings;
	}
	
	/**
	 * Função que recebe uma texto informado pelo usuário e gera o texto encriptado com base nas restrições presentes na questão 3 do desafio.
	 * O texto encriptado é retorna pelo usuário.
	 * 
	 * @param texto Texto informado pelo usuário
	 * @return texto_encriptado
	 */
	public static String gerar_texto_encriptado(String texto) {
		//remover os espaços do texto
		texto = texto.replace(" ", "");
		ArrayList<String> lista_substrings = gerar_substring_texto(texto);
		String texto_encriptado = "";
		
		//Iterage ate a ultima string completa
		for(int i=0; i < lista_substrings.get(0).length(); i++) {
			for(int j = 0; j < lista_substrings.size()-1; j++) {
				texto_encriptado = texto_encriptado + lista_substrings.get(j).charAt(i);
			}
			
			texto_encriptado = texto_encriptado+" ";
		}
		
		StringBuilder texto_builder = new StringBuilder(texto_encriptado);
		
		//Distribui a ultima string ao longo do texto encriptado
		for(int i=0; i < lista_substrings.get(lista_substrings.size()-1).length(); i++) {
			int index = texto_builder.indexOf(" ");
			texto_builder.insert(index, lista_substrings.get(lista_substrings.size()-1).charAt(i));
			texto_builder.setCharAt(index+1, '\n');
		}
		
		//Remove os caracteres acrescentados (o \n)
		texto_encriptado = texto_builder.toString().replace("\n", " ");
		//remove o espaço qu existe no fina da string
		texto_encriptado = texto_encriptado.substring(0, texto_encriptado.length()-1);
		return texto_encriptado;
	}
	
	/**
	 * Método principal. Ele é responsável por adquirir os dados do usuário via teclado e executar as rotinas
	 * implementadas para resolver a terceira questão do Desafio de Programação 02.
	 * @param args Argumentos para o método main.
	 */
	public static void main(String [] args) {
		//Para a leitura via teclado
		Scanner s = new Scanner(System.in);
		
		//Pedindo os dados ao usuário
		System.out.print("Informe o texto a ser encriptado: ");
		String texto = s.nextLine();
		//Chamando a função que gera o texto encriptado
		String texto_encriptado = gerar_texto_encriptado(texto);
		System.out.println(texto_encriptado);
		s.close(); //Fechando Scanner
		
	}
}
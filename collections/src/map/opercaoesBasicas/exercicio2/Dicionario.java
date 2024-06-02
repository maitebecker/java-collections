package map.opercaoesBasicas.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	Map<String, String> dicionario;
	
	public Dicionario() {
		this.dicionario = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void exibirPalavras() {
		if(!dicionario.isEmpty()) {
			System.out.println(dicionario);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String definicaoPorPalavra = dicionario.get(palavra);
		if(definicaoPorPalavra != null) {
			return definicaoPorPalavra;
		}
		return "Linguagem não encontrada!";
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
	    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
	    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
	    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
	    
	    dicionario.exibirPalavras();
	    
	    System.out.println("Definição da linguagem Java: " + dicionario.pesquisarPorPalavra("java"));
	    
	    dicionario.removerPalavra("typescript");
	    dicionario.exibirPalavras();
	}
}

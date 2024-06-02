package map.pesquisa.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	Map<String, Integer> contagemPalavras;
	
	public ContagemPalavras() {
		this.contagemPalavras = new HashMap<String, Integer>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemPalavras.isEmpty()) {
			contagemPalavras.remove(palavra);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public int exibirContagemPalavras() {
		int contagemTotal = 0;
		if(!contagemPalavras.isEmpty()) {
			for(int contagem : contagemPalavras.values()) {
				contagemTotal += contagem;
			}
		}
		return contagemTotal;
	}
	
	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		int maiorContagem = 0;
		if(!contagemPalavras.isEmpty()) {
			for(Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
				if(entry.getValue() > maiorContagem) {
					maiorContagem = entry.getValue();
					palavraMaisFrequente = entry.getKey();
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
		return palavraMaisFrequente;
	}
	
	public static void main(String[] args) {
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.adicionarPalavra("Java", 2);
		contagemPalavras.adicionarPalavra("Python", 8);
		contagemPalavras.adicionarPalavra("JavaScript", 1);
		contagemPalavras.adicionarPalavra("C", 6);
		
		System.out.println("Contagem de palavras: " + contagemPalavras.exibirContagemPalavras());
		System.out.println("Palavra mais frequente: "+ contagemPalavras.encontrarPalavraMaisFrequente());
	}
}

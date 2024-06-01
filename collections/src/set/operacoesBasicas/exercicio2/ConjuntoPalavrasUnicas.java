package set.operacoesBasicas.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	Set<String> conjuntoDePalavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.conjuntoDePalavrasUnicas = new HashSet<String>();
	}
	
	public void adicionarPalavra(String palavra) {
		conjuntoDePalavrasUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if(!conjuntoDePalavrasUnicas.isEmpty()) {
			if(conjuntoDePalavrasUnicas.contains(palavra)) {
				conjuntoDePalavrasUnicas.remove(palavra);
			}
			else {
				System.out.println("Palavra não encontrada no conjunto!");
			}
		}
		else {
			 System.out.println("O conjunto está vazio!");
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		return conjuntoDePalavrasUnicas.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		if(!conjuntoDePalavrasUnicas.isEmpty()) {
			System.out.println(conjuntoDePalavrasUnicas);
		}else {
			System.out.println("O conjunto está vazio!");
		}
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 1");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 2");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 3");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 4");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 1");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		conjuntoPalavrasUnicas.removerPalavra("palavra 2");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
		System.out.println("A palavra 3 está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("palavra 3"));
	}
}

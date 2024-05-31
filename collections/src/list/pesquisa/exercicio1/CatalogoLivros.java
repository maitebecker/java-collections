package list.pesquisa.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro : livroList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro livro : livroList) {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro livro : livroList) {
				if(livro.getTitulo().equals(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}
		return livroPorTitulo;
		
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
		catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
		 
		System.out.println(catalogo.pesquisarPorAutor("Robert C. Martin"));
		
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2017, 2021));
		
		System.out.println(catalogo.pesquisarPorTitulo("Código Limpo"));
	}
}
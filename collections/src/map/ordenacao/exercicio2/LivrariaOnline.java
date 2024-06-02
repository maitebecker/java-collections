package map.ordenacao.exercicio2;

import java.util.*;

public class LivrariaOnline {
	Map<String, Livro> livros;
	
	public LivrariaOnline() {
		this.livros = new HashMap<String, Livro>();
	}
	
	public void adicionarLivro(String link, Livro livro) {
		livros.put(link, livro);
	}
	
	public void removerLivro(String titulo) {
		if(!livros.isEmpty()) {
			 List<String> chavesRemover = new ArrayList<>();
			 for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			     if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
			    	 chavesRemover.add(entry.getKey());
			     }
			}
			 
		    for (String chave : chavesRemover) {
		      livros.remove(chave);
		    }
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
		Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
		Map<String, Livro> livrosOrdenadosPreco = new LinkedHashMap<String, Livro>();
		
		for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
			livrosOrdenadosPreco.put(entry.getKey(), entry.getValue());
		}
		
		return livrosOrdenadosPreco;
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
	    List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

	    Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

	    Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<String, Livro>();

	    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
	      livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
	    }

	    return livrosOrdenadosPorAutor;
	  }
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
		Map<String, Livro> livrosPorAutor = new HashMap<String, Livro>();
		
		if(!livros.isEmpty()) {
			for(Map.Entry<String, Livro> entry : livros.entrySet()) {
				if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.put(entry.getKey(), entry.getValue());
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
		return livrosPorAutor;
	}
	
	public List<Livro> exibirLivroMaisCaro() {
		List<Livro> livrosMaisCaros = new ArrayList<Livro>();
		double precoMaisAlto = Double.MIN_VALUE;
		
		if(!livros.isEmpty()) {
			for(Livro livro : livros.values()) {
				if(livro.getPreco() > precoMaisAlto) {
					precoMaisAlto = livro.getPreco();
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
		
		for(Map.Entry<String, Livro> entry : livros.entrySet()) {
			if(entry.getValue().getPreco() == precoMaisAlto) {
				Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
				livrosMaisCaros.add(livroComPrecoMaisAlto);
			}
		}
		return livrosMaisCaros;
	}
	
	public List<Livro> exibirLivroMaisBarato(){
		List<Livro> livrosMaisBaratos = new ArrayList<Livro>();
		double precoMaisBaixo = Double.MAX_VALUE;
		
		if(!livros.isEmpty()) {
			for(Livro livro: livros.values()) {
				if(livro.getPreco() < precoMaisBaixo) {
					precoMaisBaixo = livro.getPreco();
				}
			}
		}else {
			System.out.println("O conjunto está vazio");
		}
		
		for(Map.Entry<String, Livro> entry: livros.entrySet()) {
			if(entry.getValue().getPreco() == precoMaisBaixo) {
				Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
				livrosMaisBaratos.add(livroComPrecoMaisBaixo);
			}
		}
		return livrosMaisBaratos;
	}
	
	public static void main(String[] args) {
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		
		livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
	    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
	    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
	    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
	    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
	    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
	    
	    System.out.println("Livros Ordenados por preço: \n" +  livrariaOnline.exibirLivrosOrdenadosPorPreco());
	    
	    System.out.println("Livros Ordenados por Autor: \n" +  livrariaOnline.exibirLivrosOrdenadosPorAutor());
	    
	    System.out.println("Livro pesquisando por Autor George Orwell: " + livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));
	    
	    System.out.println("Livro mais barato: " +  livrariaOnline.exibirLivroMaisBarato());
	    
	    System.out.println("Livro mais caro: " +  livrariaOnline.exibirLivroMaisCaro());
	}
}

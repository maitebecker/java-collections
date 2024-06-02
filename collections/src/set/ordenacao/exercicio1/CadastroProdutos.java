package set.ordenacao.exercicio1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produto> produtosSet;
	
	public CadastroProdutos() {
		this.produtosSet = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtosSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosOrdenadosNome = new TreeSet<Produto>(produtosSet);
		return produtosOrdenadosNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosOrdenadosPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		produtosOrdenadosPreco.addAll(produtosSet);
		return produtosOrdenadosPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
	    
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	   
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	}
}

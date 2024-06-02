package map.pesquisa.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutos;
	
	public EstoqueProdutos(){
		this.estoqueProdutos = new HashMap<Long, Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto: estoqueProdutos.values()){
				valorTotalEstoque += produto.getQuantidade() * produto.getPreco();	
			}
		}else {
			System.out.println("O conjuto está vazio");
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				if(produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
					maiorPreco = produto.getPreco();
				}
			}
		}else {
			System.out.println("O conjuto está vazio");

		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto produto : estoqueProdutos.values()) {
				if(produto.getPreco() < menorPreco) {
					produtoMaisBarato = produto;
					menorPreco = produto.getPreco();
				}
			}
		}else {
			System.out.println("O conjuto está vazio");

		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque  = null;
		double maiorValorTotalProdutoEstoque = Double.MIN_NORMAL;
		if(!estoqueProdutos.isEmpty()) {
			for(Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		}else {
			System.out.println("O conjuto está vazio");

		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
	    
	    estoque.exibirProdutos();
	    
	    System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
	    System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
	    
	    System.out.println("Total estoque: " + estoque.calcularValorTotalEstoque());
	    
	    System.out.println("Produto que está em maior quantidade no estoque, considerando o valor total de cada produto: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

	}
}

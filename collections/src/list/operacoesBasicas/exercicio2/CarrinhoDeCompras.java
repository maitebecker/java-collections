package list.operacoesBasicas.exercicio2;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	ArrayList <Item> carrinhoDeCompras;
	
	public CarrinhoDeCompras() {
		this.carrinhoDeCompras = new ArrayList<Item>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoDeCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		ArrayList<Item> comprasParaRemover = new ArrayList<Item>();
		
		for(Item compra : carrinhoDeCompras) {
			if(compra.getNome().equalsIgnoreCase(nome)) {
				comprasParaRemover.add(compra);
			}
		}
		
		carrinhoDeCompras.removeAll(comprasParaRemover);
	}
	
	public void calcularValorTotal() {
		double total = 0;
		double soma = 0;
		for(Item compra : carrinhoDeCompras) {
			total = (compra.getPreco() * compra.getQuantidade());
			soma += total;
		}
		System.out.println("Valor total: " + soma);
	}
	
	public void exibirItens() {
		for(Item compra : carrinhoDeCompras) {
			System.out.println("[Nome: "+ compra.getNome() + ", Preço: " + compra.getPreco() + ", Quantidade: " + compra.getQuantidade() + "]");
		}
	}
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem("Refrigerante", 10.0, 1);
		carrinho.adicionarItem("Arroz", 20.0, 1);
		carrinho.adicionarItem("Pão", 7.0, 2);
		
		carrinho.removerItem("Refrigerante");
		
		carrinho.calcularValorTotal();
		
		carrinho.exibirItens();
	}
}

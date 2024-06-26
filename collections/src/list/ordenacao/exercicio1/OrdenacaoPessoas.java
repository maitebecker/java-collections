package list.ordenacao.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
	    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
	    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
	    
	    System.out.println("Ordenação por Idade:");
	    System.out.println(ordenacaoPessoas.ordenarPorIdade());
	    
	    System.out.println("Ordenação por Altura:");
	    System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}

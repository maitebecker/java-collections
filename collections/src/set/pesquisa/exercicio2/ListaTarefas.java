package set.pesquisa.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	Set<Tarefa> listaTarefas;
	
	public ListaTarefas() {
		this.listaTarefas = new HashSet<Tarefa>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if(!listaTarefas.isEmpty()) {
			for(Tarefa tarefa : listaTarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = tarefa;
					break;
				}
			}
			listaTarefas.remove(tarefaParaRemover);
		}else {
			 System.out.println("A lista está vazia");
		}
	}
	
	public void exibirTarefas() {
		if(!listaTarefas.isEmpty()) {
			System.out.println(listaTarefas);
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public int contarTarefas() {
		return listaTarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
		if(!listaTarefas.isEmpty()) {
			for(Tarefa tarefa : listaTarefas) {
				if(tarefa.isTarefaConcluida()) {
					tarefasConcluidas.add(tarefa);
				}
			}
		}else {
			System.out.println("A lista está vazia");
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();
		if(!listaTarefas.isEmpty()) {
			for(Tarefa tarefa : listaTarefas) {
				if(!tarefa.isTarefaConcluida()) {
					tarefasPendentes.add(tarefa);
				}
			}
		}else {
			System.out.println("A lista está vazia");
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if(!listaTarefas.isEmpty()) {
			for(Tarefa tarefa : listaTarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefa.setTarefaConcluida(true);
				}
			}
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		if(!listaTarefas.isEmpty()) {
			for(Tarefa tarefa: listaTarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefa.setTarefaConcluida(false);
				}
			}
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public void limparListaTarefas() {
		if(!listaTarefas.isEmpty()) {
			listaTarefas.clear();
		}else {
			System.out.println("A lista já está vazia");
		}
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");
		    
		System.out.println("Número de tarefas: " + listaTarefas.contarTarefas());
		
		listaTarefas.marcarTarefaConcluida("Estudar Java");
		listaTarefas.exibirTarefas();
		
		System.out.println("Tarefas concluidas:");
		System.out.println(listaTarefas.obterTarefasConcluidas());
		
		System.out.println("Tarefas pendentes:");
		System.out.println(listaTarefas.obterTarefasPendentes());
		
		listaTarefas.removerTarefa("Ler livro");
		listaTarefas.exibirTarefas();
		
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
	}
}

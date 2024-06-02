package map.opercaoesBasicas.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatos;
	
	public AgendaContatos() {
		this.agendaContatos = new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatos.isEmpty()) {
			agendaContatos.remove(nome);
		}else {
			System.out.println("O conjunto está vazio");
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatos.isEmpty()) {
			numeroPorNome = agendaContatos.get(nome);
		}else {
			System.out.println("O conjunto está vazio");
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
	    agendaContatos.adicionarContato("João", 5665);
	    agendaContatos.adicionarContato("Carlos", 1111111);
	    agendaContatos.adicionarContato("Ana", 654987);
	    agendaContatos.adicionarContato("Maria", 1111111);
	    agendaContatos.adicionarContato("Camila", 44444);
	    
	    agendaContatos.removerContato("Maria");
	    
	    agendaContatos.exibirContatos();
	    
	    System.out.println("Pesquisando o número da Camila: " + agendaContatos.pesquisarPorNome("Camila"));	
	}
}

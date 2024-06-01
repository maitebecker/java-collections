package set.pesquisa.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	Set<Contato> contatosSet;
	
	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatosSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatosSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		if(!contatosSet.isEmpty()) {
			for(Contato contato : contatosSet) {
				if(contato.getNome().startsWith(nome)) {
					contatosPorNome.add(contato);
				}
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if(!contatosSet.isEmpty()) {
			for(Contato contato : contatosSet) {
				if(contato.getNome().equalsIgnoreCase(nome)) {
					contato.setNumero(novoNumero);
					contatoAtualizado = contato;
					break;
				}
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaDeContatos = new AgendaContatos();
		
		agendaDeContatos.adicionarContato("Maria", 987654321);
	    agendaDeContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaDeContatos.adicionarContato("Ana", 88889999);
	    agendaDeContatos.adicionarContato("Fernando", 77778888);
	    agendaDeContatos.adicionarContato("Carolina", 55555555);
	    
	    agendaDeContatos.exibirContatos();
	    
	    System.out.println("Pesquisando o nome Maria: " + agendaDeContatos.pesquisarPorNome("Maria"));
	    System.out.println("Contato atualzado: " + agendaDeContatos.atualizarNumeroContato("Ana", 66669999));
	   
	    agendaDeContatos.exibirContatos();
	}
}

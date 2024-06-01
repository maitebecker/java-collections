package set.operacoesBasicas.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadosSet;
	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<Convidado>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadosSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		
		for(Convidado c : convidadosSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}	
		convidadosSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());
		
		conjuntoConvidados.adicionarConvidado("Alice", 1234);
	    conjuntoConvidados.adicionarConvidado("Bob", 1235);
	    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
	    conjuntoConvidados.adicionarConvidado("David", 1236);

		System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());

		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		
		conjuntoConvidados.exibirConvidados();
	}
}

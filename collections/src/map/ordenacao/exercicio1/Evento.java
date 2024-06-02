package map.ordenacao.exercicio1;

public class Evento {
	String nomeEvento;
	String nomeAtracao;
	
	public Evento(String nomeEvento, String nomeAtracao) {
		this.nomeEvento = nomeEvento;
		this.nomeAtracao = nomeAtracao;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public String getNomeAtracao() {
		return nomeAtracao;
	}

	@Override
	public String toString() {
		return "[nomeEvento=" + nomeEvento + ", nomeAtracao=" + nomeAtracao + "]";
	}
	
}

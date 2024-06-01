package set.pesquisa.exercicio2;

public class Tarefa {
	private String descricao;
	private boolean tarefaConcluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isTarefaConcluida() {
		return tarefaConcluida;
	}
	
	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}
	
	@Override
	public String toString() {
		return "[descricao=" + descricao + ", tarefaConcluida=" + tarefaConcluida + "]";
	}
}

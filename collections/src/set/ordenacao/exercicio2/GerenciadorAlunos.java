package set.ordenacao.exercicio2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	Set<Aluno> listaAlunos;
	
	public GerenciadorAlunos() {
		this.listaAlunos = new HashSet<Aluno>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		listaAlunos.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		if(!listaAlunos.isEmpty()) {
			for(Aluno aluno : listaAlunos) {
				if(aluno.getMatricula() == matricula) {
					alunoParaRemover = aluno;
					break;
				}
			}
			listaAlunos.remove(alunoParaRemover);
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public void exibirAlunosPorNome(){
		Set<Aluno> alunosOrdenadosNome = new TreeSet<Aluno>(listaAlunos);
		if(!listaAlunos.isEmpty()) {
			System.out.println(alunosOrdenadosNome);
		}else {
			System.out.println("A lista está vazia");
		}
		
	}
	
	public void exibirAlunosPorNota(){
		Set<Aluno> alunosOrdenadosNota = new TreeSet<Aluno>(new ComparatorNota());
		if(!listaAlunos.isEmpty()) {
			alunosOrdenadosNota.addAll(listaAlunos);
			System.out.println(alunosOrdenadosNota);
		}else {
			System.out.println("A lista está vazia");
		}
	}
	
	public void exibirAlunos() {
		System.out.println(listaAlunos);
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
	    gerenciadorAlunos.adicionarAluno("Matheus", 123459L, 9.8);
	    
	    gerenciadorAlunos.removerAluno(123456L);
	    
	    System.out.println("Exibindo alunos por nome:");
	    gerenciadorAlunos.exibirAlunosPorNome();
	    
	    System.out.println("Exibindo alunos por nota:");
	    gerenciadorAlunos.exibirAlunosPorNota();
	}
}

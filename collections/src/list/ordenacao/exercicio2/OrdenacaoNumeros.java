package list.ordenacao.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	List<Integer> listaNumeros;
	
	public OrdenacaoNumeros(){
		this.listaNumeros = new ArrayList<Integer>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numerosAscendentes = new ArrayList<Integer>(listaNumeros);
		
		if(!listaNumeros.isEmpty()) {
			Collections.sort(numerosAscendentes);
			return numerosAscendentes;
		}else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numerosDescendente = new ArrayList<Integer>(listaNumeros);
		if(!listaNumeros.isEmpty()) {
			numerosDescendente.sort(Collections.reverseOrder());
			return numerosDescendente;
		}else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
		
		ordenacao.adicionarNumero(0);
		ordenacao.adicionarNumero(20);
		ordenacao.adicionarNumero(5);
		ordenacao.adicionarNumero(17);
		ordenacao.adicionarNumero(8);
		ordenacao.adicionarNumero(10);
		
		System.out.println("Ordem Ascendente");
		System.out.println(ordenacao.ordenarAscendente());
		
		System.out.println("Ordem Descendente");
		System.out.println(ordenacao.ordenarDescendente());
	}

}

package list.pesquisa.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List<Integer> listaNumeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<Integer>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero : listaNumeros) {
			soma += numero;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer numero : listaNumeros) {
				if(numero > maior) {
					maior = numero;
				}
			}	
			return maior;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
		
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if(!listaNumeros.isEmpty()) {
			for(Integer numero : listaNumeros) {
				if(numero < menor) {
					menor = numero;
				}
			}
			return menor;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
		
	}
	
	public void exibirNumeros() {
		if(!listaNumeros.isEmpty()) {
			System.out.println(listaNumeros); 
		}else {
			System.out.println("A lista está vazia!");
		}
		
	}
	
	public static void main(String[] args) {
		SomaNumeros numeros = new SomaNumeros();
		
		numeros.adicionarNumero(0);
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(10);
		
		System.out.println("Lista de números: ");
		numeros.exibirNumeros();
		
		System.out.println("Soma dos números: " + numeros.calcularSoma());
		
		System.out.println("Menor número: " + numeros.encontrarMenorNumero());
		
		System.out.println("Maior número: " + numeros.encontrarMaiorNumero());
	}
}

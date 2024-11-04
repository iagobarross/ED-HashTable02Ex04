package controller;

import br.edu.fateczl.*;

public class HashMultiplicacao {
	Lista[] lista;

	public HashMultiplicacao() {
		lista = new Lista[5];
		inicializaLista();
	}

	private void inicializaLista() {
		int tamanho = lista.length;
		for (int i = 0; i < tamanho; i++) {
			lista[i] = new Lista();
		}
	}

	private int hash(int numero) {
		double a = (Math.sqrt(13) - 3) / 2;
		
		return (int) ((int) 5 * ((a * numero) % 1));
	}

	public Lista[] hashTable(Lista[] listaOriginal) throws Exception {
		int tamanho = listaOriginal.length;
		
		for(int i = 0; i < tamanho; i++) {
			int tamanhoLista = listaOriginal[i].size();
			for(int j = 0; j < tamanhoLista; j++) {
				int valor = (int) listaOriginal[i].get(j);
				int posicao = hash(valor);
				lista[posicao].addLast(valor);
			}
		
		}
		return lista;
	}
	
	public void listTable() throws Exception {
		int tamanho = lista.length;
		System.out.println("\nHash Multiplicação");
		for(int i = 0; i < tamanho; i++) {
			System.out.println("\n" + i + ":");
			int tamanhoLista = lista[i].size();
			for(int j = 0; j < tamanhoLista; j++) {
				System.out.print(lista[i].get(j) + " ");
			}
		}
	}
}

package br.edu.fateczl;

public class No<T> {
	
	T dado;
	No<T> proximo;
	
	@Override
	public String toString() {
		return "" + dado;
	}
}

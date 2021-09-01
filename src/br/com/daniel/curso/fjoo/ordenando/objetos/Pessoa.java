package br.com.daniel.curso.fjoo.ordenando.objetos;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	
	
	int getIdade() {
		return idade;
	}
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return this.nome + " tem " + this.idade + " anos.";
		
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.getNome());
	}
	
	
}

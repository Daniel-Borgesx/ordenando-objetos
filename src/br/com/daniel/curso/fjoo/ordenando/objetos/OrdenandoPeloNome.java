package br.com.daniel.curso.fjoo.ordenando.objetos;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Daniel", 25);
		Pessoa p2 = new Pessoa("Pedro", 25);
		Pessoa p3 = new Pessoa("Breno", 23);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}

}

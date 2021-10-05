package br.com.abc.javacore.introducaometodos.test;
import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String... args) {
		
		Estudante joao = new Estudante();
		joao.nome = "João costa";
		joao.idade = 35;
		joao.notas = new double[]{5,6,7}; 
		joao.imprimiDados();
		joao.caucularMedia();
		
	}
	
}

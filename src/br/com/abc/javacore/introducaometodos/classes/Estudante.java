package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {

	
	public String nome;
	public int idade;
	public double[] notas = new double[3];
	
	
	public void imprimiDados(){
		
		System.out.println("---------Os Dados do Estudante são---------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Notas: nota1 - "+this.notas[0]+", nota2 - "+this.notas[1]+ ", nota3 - "+this.notas[2]);
				
	}
	
	public void caucularMedia(){
		double total = 0 ;
		double media ;
		
		for(double n : this.notas) {
			total += n;	
		}
		
		media = total /3;
		
		System.out.println("A media do aluno é - " +media);
		
		if(media < 6) {
			System.out.println("O aluno Esta Reprovado");
			
		}else {
			System.out.println("O aluno Esta Aprovado");
		}
		
	}
	
	
}

package br.com.abc.javacore.introducaometodos.classes;

/***
 * Crie os seguintes atributos para essa classes
 * nome
 * matricula
 * rg
 * cpf
 *
 * crie uma classe de teste para preencher e imprimir os dados .
 */
public class Professsor {

        public String nome;
        public String matricula;
        public String rg;
        public String cpf;

        //Recebendo um objeto como parametro
        public void imprime(){
                System.out.println("___________________");
                System.out.println(this.cpf);
                System.out.println(this.matricula);
                System.out.println(this.nome);
                System.out.println(this.rg);
        }

}
package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    /***
     *
     */

    public static void main(String[] args) {

        Estudante joao = new Estudante();

        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println("O nome do aluno é: "+ joao.nome);
        System.out.println("Com a matricula: "+joao.matricula );
        System.out.println("e a idade: "+joao.idade);
    }

}

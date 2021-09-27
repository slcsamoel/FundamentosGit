package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Estudante;

/***
 *  Classe Responsavel pela manipulação da classe estudante que esta no pacote br.com.abc.javacore.introducaoclasse ;
 *  é necessario fazer a importação da classe para conseguir usa, atravẽs do comando: import  EX:
 *  import br.com.abc.javacore.introducaoclasses.Estudante;
 */


public class EstudanteTest {

    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

    }

}

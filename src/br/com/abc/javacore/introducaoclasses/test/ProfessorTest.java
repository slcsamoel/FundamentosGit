package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professsor;

/***
 * Estanciando dois objetos de Professor
 *
 *
 */

public class ProfessorTest {

    public static void main(String[] args) {
        Professsor professor = new Professsor();
        professor.nome = "joao prof";
        professor.matricula = "123654";
        professor.cpf = "252.255.256-58";
        professor.rg = "122458665";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);

        Professsor professor2 = new Professsor();
        professor2.nome ="juciclei";
        professor2.matricula = "254585";
        professor2.rg = "6664532";
        professor2.cpf ="065.245.665-89";

        System.out.println("---------------------------------");

        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.cpf);
        System.out.println(professor2.rg);

    }

}

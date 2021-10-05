package br.com.abc.javacore.introducaometodos.test;
import br.com.abc.javacore.introducaometodos.classes.Professsor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professsor prof = new Professsor();
        prof.cpf = "123.123.123-45";
        prof.matricula = "1213654";
        prof.nome = "Professor um ";
        prof.rg = "5656462353";

        Professsor prof2 = new Professsor();
        prof2.cpf = "789.123.123-45";
        prof2.matricula = "896513654";
        prof2.nome = "Professor Dois ";
        prof2.rg = "56564625454";

       // passando um objeto estanciado como parametro
       prof.imprime();
       prof2.imprime();
       System.out.println("Teste de impressão");
    }
}

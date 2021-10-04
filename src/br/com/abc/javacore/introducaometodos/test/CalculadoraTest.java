package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;
/***
 *
 */
public class CalculadoraTest {

    public static void main(String[] arg) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtrairDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        double resulDiv = calc.divideDoisNumeros(20,2);  //recebendo o retorno do metodo
        System.out.println("Divisão: "+resulDiv);
        System.out.println("Imprime dois numeros dividido");

        calc.imprimeDoisNumerosDivididos(20,5);

        System.out.println("Continuando a execução");
    }

}

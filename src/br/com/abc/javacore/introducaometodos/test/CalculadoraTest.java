package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;
/***
 *
 */
public class CalculadoraTest {

    public static void main(String... arg) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtrairDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        double resulDiv = calc.divideDoisNumeros(20,2);  //recebendo o retorno do metodo
        System.out.println("Divisão: "+resulDiv);
        System.out.println("Imprime dois numeros dividido");

        calc.imprimeDoisNumerosDivididos(20,5);

        System.out.println("Continuando a execução");
        
        int [] numeros = new int[]{1,2,3,4,5};
        
        calc.somaArray(numeros); 
        
        calc.somaVarArgs(1,2,3,4,5);  // pode-se passa os valores separados por virgula pois a função esta recebendo um var args
        
    }

}

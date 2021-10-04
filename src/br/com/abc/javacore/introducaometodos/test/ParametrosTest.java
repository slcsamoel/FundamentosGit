package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String []args){
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;

        // ao passar variaves de tipos primitivos para os metodos são passados apenas o valor que a vaviavel esta
        // armazenando no momento porem  EX:
        calc.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do Teste ");
        System.out.println("num1: "+num1+" num2: "+num2);

    }
}

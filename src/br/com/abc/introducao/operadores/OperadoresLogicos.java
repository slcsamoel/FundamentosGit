package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    /***
     * br.com.abc.introducao.operadores.Operadores Lógicos
     *  && => AND
     *  || => OR
     *
     */
    public static void main (String[] args)
    {
        int idade = 18;
        float salario = 1000;

        System.out.println(idade>=18 && salario>=1000); // operador AND só retornara True(verdadeiro) si as duas condições for verdadeira
        System.out.println(idade>=18 || salario>=900); // operador OR só retornara True(verdadeiro) si umas das condições for verdadeira

    }
}

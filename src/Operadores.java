public class Operadores {
    /***
     *  Operadores Basicos
     *  ++ incremento
     *  -- decremento
     *  + operador de adição(obs também ultilizado para junta uma string com uma variaval ex ("string"+variavel)
     *  * multiplicação
     *  /divisão
     *  -Subtração
     */

    public static void main (String[] args)
    {
        int numero1 = 10 ;
        int numero2 = 20 ;

        System.out.println("A soma é : "+ (numero1+numero2));
        System.out.println("A Subtração é : "+ (numero1-numero2));
        System.out.println("A multiplicação é : "+ (numero1*numero2));
        System.out.println("A Divisão é : "+ (numero1/numero2));

        int restoDivisao = 20%2;
        System.out.println("O resto da Divisão : "+restoDivisao);


    }


}

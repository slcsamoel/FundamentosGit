package br.com.abc.introducao.operadores;

public class OperadoresComparacao {
    /***
     * br.com.abc.introducao.operadores.Operadores de Comparação
     *  < menor que
     *  > maior que
     *  <= menor igual
     *  >= maior igual
     *  == igual
     *  != Diferente
     *
     */

     public static void main(String[] args)
     {
         boolean maiorQue = 10>20;
         boolean menorQue = 10<20;
         boolean igualMenor = 10<=20;
         boolean igualMaior = 10>=20;
         boolean igual = 10==20;

         System.out.println("Maior que > :"+maiorQue);
         System.out.println("Menor que < :"+menorQue);
         System.out.println("Maior ou igual  >= :"+igualMaior);
         System.out.println("Menor ou igual  <= :"+igualMenor);
         System.out.println("Igual  == :"+igual);

         int restoDiv =  20%2;

         //Estrutura Condiçionais
         if(restoDiv >0){
             System.out.println("O Numero é impar");
         }else{
             System.out.println("O Numero é Par");
         }


     }

}

package br.com.abc.introducao.arrays;

public class Arrays3 {
    /***
     *  A forma de inicializar um array no java
     *
     *  A partir das versões 6 do já tem um novo tipo de laçõ de repetição o foreach
     *
     */

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        //for (int i = 0; i < numeros2.length; i++) {
        //     System.out.println(numeros2[i]);
       // }

        //em cada interação Pega cada valor dentro do array e seta no aux
        for(int aux : numeros2){
            System.out.println(aux);
        }


    }
}

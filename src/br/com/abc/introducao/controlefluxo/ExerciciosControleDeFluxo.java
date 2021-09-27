package br.com.abc.introducao.controlefluxo;

public class ExerciciosControleDeFluxo {
    /***
     *
     * Imprima todos os numeros pares de 0 a 100.000
     * */


    public static void main(String[] args) {
        int valor = 10;
        int qnt = 0;

        for(int i = 0 ; i <= valor; i++){
            if(i%2 == 0){
                System.out.println(i);
                qnt++;
            }
        }

        System.out.println("O total de numeros pares entre 0 e "+valor+" é: "+qnt);

    }

}

package br.com.abc.introducao.arrays;

public class Arrays5 {
    /***
     *  Arrays bi-dimensional
     *  declaração
     *  int [][]dias = new int[31][12];
     *
     *  Basicamente é um array dentro do outro array
     *
     *  Array bi dimensional dias = {  Posição 0:{ 0:{},1:{} }, Posição 1:{0:{},1:{}}   }
     *  Para cadas posição do array dias tem como valor outro array
     *
     *  na declaração do array é obrigado a definir o tamanho do array "pai" exe : int [][] dias = [2][0]
     *  os arrays referente a cada posição do array dias não é obrigatorio que seja definido na declaração
     *
     */

    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0; i < dias.length; i++) {

            System.out.println("valores na posição " + i);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------------------------------------------");
        for (int[] ref : dias) {
            System.out.println("referencia " + ref);
            for (int dia : ref) {
                System.out.println(dia);
            }
        }

    }

}

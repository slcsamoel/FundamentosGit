package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo4 {
    /***
     *  laçõs de repetição
     *
     * while => repete um pedaço do codigo enquanto a condição não for atendida(é necessario
     *
     * do while => Executa um vez caso a condição não seja atendida entra no loop
     *
     * break => para sair de um laço de repetição
     *
     */

    public static void main (String [] args){

        int contador = 0;

        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }

        contador = 0;

        do{
            System.out.println("Condição do-while"+ contador++);
        }while(contador <= 10);


        for(int i = 0; i<10; i++){
            System.out.println("O Valor de i é:"+i);
            if(i==5){
                break;
            }
        }


    }
}

package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo5 {
    /***
     * dado um valor de um carro descubra em qnt vezes ele pode ser parcelado porém as parcelas não pode ser menor
     * do que 10000
     *
     */
    public static void main(String[] args) {

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break; //
            }
            System.out.println("Em "+parcela+" Parcelas o valor sera R$:" + valorParcela);

        }


    }
}

package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo2 {
    /***
     *  ? => operador Ternario
     */
    public static void main(String[] args) {
        int idade = 15;
        String status = idade > 18 ? "Adulto" : "Não adulto";
        System.out.println(status);
    }
}

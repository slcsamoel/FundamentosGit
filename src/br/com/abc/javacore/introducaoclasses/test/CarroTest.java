package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fuscar";
        carro.placa = "QWJ-1029";
        carro.velocidadeMaxima = 120;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }

}

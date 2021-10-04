package br.com.abc.javacore.introducaometodos.classes;

/***
 *   criação de metodos
 *   - o nome do metodo deve ser camelcase (começa com a letra minuscula )
 *
 *   - deve-se declara o modificador de acesso (public , private , protected... )
 *
 *   - tipo de retorno caso o metodo for retornar algum valor
 *     ou deve-se ultilizar a palavra void caso o metodo não retorne nada
 *
 */
public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtrairDoisNumeros() {  // metodo sem retorno(void)
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {  // metodo sem retorno(void) recebendo parametros
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) { // metodo com retorno de valor double recebendo 2 double como parametro
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDoisNumerosDivididos(double num1 , double num2 ){
        if(num2 !=0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("não é possivel dividir por Zero :");
    }

    public void alteraDoisNumeros(int num1 , int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do Altera dois Numeros .");
        System.out.println("num1: "+num1+" num2: "+num2);
    }
}

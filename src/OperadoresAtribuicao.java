public class OperadoresAtribuicao {
    /***
     * Operadores de atribuição
     * = atribuir valor a uma variavel
     * -=
     * +=
     * *=
     * /=
     *
     */
    public static void main(String[] args) {

        int salario = 1800;
        salario += 1000;
        System.out.println("Salario :"+salario);
        int dezPorCento = (int)(salario * 0.1);
        System.out.println("10% do Salario : "+dezPorCento);

        int salarioMaisDezPorCento = salario + dezPorCento;
        System.out.println("Salario mais 10% : "+salarioMaisDezPorCento);

    }
}

public class ControleDeFluxo1 {
    /***
     * Controle de Fluxo
     *
     * Estruturas de condições
     *
     * if => recebe por padrão um boolean e verifica si e true ou false e executa um codigo especifico para cada resposta
     *else if => caso a condição do if não seja a atendida ,verifica si e true ou false e executa um codigo especifico para cada resposta
     *else => si nenhuma condição acima for atendida
     *
     *
     *
     */
    public static void main(String[] args) {
        boolean test = false;
        if (test) {
            System.out.println("Entrou no if true");
        } else if (test == false) {
            System.out.println("Entrou no If False");
        } else {
            System.out.println("Não entrou no if ");
        }

        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}

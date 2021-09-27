public class Arrays2 {
    /***
     *  //byte , short , long , float , double
     *  para arrays inteiros o valor padrão de cada posição zero
     *
     *  Para arrays do tipo char o valor padrao é um espaço em branco '' OR Null
     *
     *  Para arrays do tipo boolean sera false;
     *
     */
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i+1) +" nome: "+nomes[i]);
        }


    }

}

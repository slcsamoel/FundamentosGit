public class Arrays6 {
    /***
     *
     *
     *
     */
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3};

        // int[][] dias = new int[3][];
        // dias[0] = new int[2];
        // dias[1] = new int[]{1,2,3};
        //dias[2] = new int[4];

        //indice sempre começa com 0
        int[][] dias = {{0, 0}, {1, 2, 3}, {4, 5, 6, 7}};

        for (int[] arr : dias) {
            System.out.println("posição do array pai :" + arr);
            for (int num : arr) {
                System.out.println(num);
            }
        }


    }
}

public class k_multiple_2d_array {
    public static void main(String[] args) {
        int pos[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                pos[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(pos[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

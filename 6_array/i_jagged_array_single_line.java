public class i_jagged_array_single_line {
    public static void main(String[] args) {
        int[][] mynums = { { 1, 2, 3, 4, }, { 5, 6, 7 } };
        for (int i = 0; i < mynums.length; i++) {
            for (int j = 0; j < mynums[i].length; j++) {
                System.out.print(mynums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

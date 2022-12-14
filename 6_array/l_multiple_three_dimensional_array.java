public class l_multiple_three_dimensional_array {
    public static void main(String[] args) {
        // 3x2x3
        int[][][] arr = {
                {
                        { 1, 2, 3 }, { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 }, { 10, 11, 12 }
                },
                {
                        { 13, 14, 15 }, { 16, 17, 18 }
                }
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

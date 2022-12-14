public class h_two_dimensional_for_all_record {
    public static void main(String[] args) {
        int[][] myarray = {
                { 12, 34, 45 },
                { 35, 67, 23 }
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(myarray[i][j]);
            }
        }
    }
}

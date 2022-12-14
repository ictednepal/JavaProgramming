public class e_single_dime_sum_of_array_elements {
    public static void main(String[] args) {
        int sum = 0;
        int marks[] = { 98, 78, 56, 34, 67 };
        for(int mark: marks){
            sum += mark;
        }
        System.out.println("The sum = "+sum);
    }
}

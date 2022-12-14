public class f_single_dime_average_of_array_elements {
    public static void main(String[] args) {
        int sum = 0, arrlength;
        double avg;
        int marks[] = { 98, 78, 56, 34, 67 };
        for(int mark: marks){
            sum += mark;
        }
        arrlength = marks.length;
        avg = ((double)sum / (double)arrlength);
        System.out.println("Average = "+avg);
    }
}

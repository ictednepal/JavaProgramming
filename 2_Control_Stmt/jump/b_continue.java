public class b_continue {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i+=2) {
            if(i==27){
                continue;
            }
            System.out.println(i);
        }
    }
}

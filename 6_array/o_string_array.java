public class o_string_array {
    public static void main(String[] args) {
        String[] names = {"Ram","Sita","Hari","Gita","Nita","Mina","Laxman"};
        // System.out.println(names[5]); // Mina
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }

        for (String name : names) {
            System.out.println(name);
        }
    }
}

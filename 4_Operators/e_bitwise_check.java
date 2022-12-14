public class e_bitwise_check {
    public static void main(String[] args) {
        int a = 60; // 60 = 0011 1100
        int b = 13; // 13 = 0000 1101

        // Bitwise AND (&) operator demo
        int c = a & b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0000 1100 (Bitwise AND (&) where True & True = True otherwise False)
         * 0000 1100 = 12(in Decimal)
         */
        System.out.println("Bitwise a & b = " + c);

        // Bitwise OR (|) operator demo
        int d = a | b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0011 1101 (Bitwise OR (|) where False | False = False otherwise True)
         * 0011 1101 = 61(in Decimal)
         */
        System.out.println("Bitwise a | b = " + d);

        // Bitwise XOR (^) operator demo
        int e = a ^ b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0011 0001 (Bitwise XOR (^) where ......)
         * 0011 0001 = 49(in Decimal)
         */
        System.out.println("Bitwise a ^ b = " + e);

        // Bitwise 1's Complement (~) operator demo
        int f = ~a;
        System.out.println("Bitwise ~a = " + f);
    }
}

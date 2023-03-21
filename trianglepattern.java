public class trianglepattern {
    public static void main(String[] args) {
        int i, k, l;
        int j;
        for (i = 0; i < 5; i++) {

            if (i % 2 == 0) {
                for (j = 0; j <= i; j++) {
                    System.out.print("x");
                }
                System.out.println();
            }

        }
        for (k = 3; k >= 0; k--) {
            if (k % 2 == 0) {
                for (l = 0; l <= k; l++) {
                    System.out.print("x");
                }
                System.out.println();
            }
        }
    }
}
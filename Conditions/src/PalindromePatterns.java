// dimond pattern

public class PalindromePatterns {
    public static void main(String arg[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                //for first half
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        // for second part
        for (int i = n; i >= 1; i--) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for first half
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }

    }

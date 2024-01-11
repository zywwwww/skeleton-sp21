/** Class that prints the Collatz sequence starting from a given number.
 *  @author zywwwww
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        int res;
        if (n % 2 == 0) {
            res = n / 2;
        }
        else {
            res = n * 3 + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}


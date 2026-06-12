import java.util.*;
class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (long i = 1; i < n; i++) {
            actualSum += sc.nextLong();
        }

        System.out.println(expectedSum - actualSum);
    }
}

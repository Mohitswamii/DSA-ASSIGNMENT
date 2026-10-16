
import java.util.Scanner;

public class _11_productDigits {
    static int product(int n) {
        if (n < 10) return n;

        return (n % 10) * product(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(product(n));
    }
}

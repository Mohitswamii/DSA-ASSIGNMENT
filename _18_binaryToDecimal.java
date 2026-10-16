
import java.util.Scanner;

public class _18_binaryToDecimal {
    static long convert(String s, int i) {
        if (i == s.length()) return 0;

        return (s.charAt(i) - '0')
                * power2(s.length() - 1 - i)
                + convert(s, i + 1);
    }

    static long power2(int n) {
        if (n == 0) return 1;

        return 2 * power2(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convert(s, 0));
    }
}

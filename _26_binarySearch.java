
import java.util.Scanner;

public class _26_binarySearch {
    static int search(int[] a, int x, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (a[mid] >= x) {
            int left = search(a, x, low, mid - 1);

            if (left != -1) return left;

            if (a[mid] == x) return mid;

            return -1;
        }

        return search(a, x, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(search(a, x, 0, n - 1));
    }
}

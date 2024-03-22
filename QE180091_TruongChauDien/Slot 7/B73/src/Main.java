import java.util.Scanner;

public class Main {

    static int[] a = new int[100];

    static int count(int[] a, int l, int r, int x) {
        if (l == r) {
            if (a[l] == x) return 1;
            else return 0;
        } else {
            int m = (l + r) / 2;
            return count(a, l, m, x) + count(a, m + 1, r, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(count(a, 0, n - 1, x));
    }
}

import java.util.Scanner;

public class EX75 {
    public static int moneyChange(int[] a, int n, int x) {
        int[] l = new int[x + 1];
        for (int i = 0; i <= x; i++)
            l[i] = 0;
        for (int i = 0; i < n; i++)
            l[a[i]] = 1;
        for (int i = 1; i <= x; i++)
            for (int j = 0; j < n; j++)
                if (i >= a[j]) {
                    if ((l[i] > l[i - a[j]] + 1 && l[i - a[j]] != 0) || (l[i] == 0 && l[i - a[j]] != 0)) {
                        l[i] = l[i - a[j]] + 1;
                    }
                }
        return l[x];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, x;
        n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        x = scanner.nextInt();

        System.out.println(moneyChange(a, n, x));
    }
}
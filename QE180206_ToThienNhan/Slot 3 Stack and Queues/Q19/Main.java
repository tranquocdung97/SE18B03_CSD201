import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[1001];
        int[] a = new int[1001];

        Scanner scanner = new Scanner(System.in);

        int n, k;
        n = scanner.nextInt();

        for (int i = 0; i < 1001; i++) {
            b[i] = false;
        }

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (!b[a[i]]) {
                if (q.size() < k) {
                    b[a[i]] = true;
                    q.add(a[i]);
                } else {
                    b[q.peek()] = false;
                    b[a[i]] = true;
                    q.add(a[i]);
                    q.poll();
                }
            }
        }

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}

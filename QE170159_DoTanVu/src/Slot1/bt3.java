
package Slot1;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        squareElements(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        scanner.close();
    }
    public static void squareElements(int[] arr) {
=======

        // Nhap so nguyen duong n
        int n = scanner.nextInt();

        // Khoi tao mang a co kich thuoc n
        int[] a = new int[n];

        // Nhap n so nguyen lan luot la cac phan tu trong day a
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Thay doi gia tri cua moi phan tu thanh binh phuong cua chinh no
        squareElements(a);

        // In mang sau khi thay doi ra man hinh
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        // Dong Scanner
        scanner.close();
    }

    public static void squareElements(int[] arr) {
        // Thay doi gia tri cua moi phan tu thanh binh phuong cua chinh no
>>>>>>> cbdbd624963f7b9c80f7ce72172b7dfb9bcb4393
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> cbdbd624963f7b9c80f7ce72172b7dfb9bcb4393

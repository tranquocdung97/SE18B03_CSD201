
package b71;

import java.util.Scanner;


public class B71 {

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result =  new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i1++;
                    i++;
                } else{
                    result[i] = a2[i2];
                    i2++;
                    i++;
                }
            } else 
            if (i1 < a1.length) {
                result[i] = a1[i1];
                i1++;
                i++;
            } else {
                result[i] = a2[i2];
                i2++;
                i++;
            }
        }
        return result;
    }
    
    public static int[] mergeSort(int[] a, int l, int r) {
        if (l > r)
            return new int[0];
        if (l == r) {
            int[] singleElement = {a[l]};
            return singleElement;
        }
        int k = (l + r) / 2;
        int[] a1 = mergeSort(a, l, k);
        int[] a2 = mergeSort(a, k + 1, r);
        int[] result = merge(a1, a2);
        return result;
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = mergeSort(arr, 0, n - 1);
        int k = 1, max = 0;
        for (int i = n-1; i >= 0; i--){
            if (arr[i] + k > max)
                max = arr[i] + k;
            k++;
        }
        System.out.println(max);
    }    
}

package Bai35;
import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch(sc, n);
        linearSearch.addElements();
        linearSearch.findEvenNumFromOddIndex();
    }
}

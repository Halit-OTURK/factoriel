package donguler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int a, total = 1;
        Scanner fakt = new Scanner(System.in);
        System.out.print("faktöriyel sayısını giriniz:");
        a = fakt.nextInt();
        for (int i = 1; i <= a; i++) {
            total = total * i;
        }
        System.out.println("Toplam:" + total);
    }
}

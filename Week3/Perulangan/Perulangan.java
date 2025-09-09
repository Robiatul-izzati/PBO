package Perulangan;

public class Perulangan {
    public static void main(String[] args) {
        System.out.println("Perulangan for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        System.out.println("\nPerulangan while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iterasi ke-" + j);
            j++;
        }

        System.out.println("\nPerulangan do-while:");
        int k = 1;
        do {
            System.out.println("Iterasi ke-" + k);
            k++;
        } while (k <= 5);
    }
}
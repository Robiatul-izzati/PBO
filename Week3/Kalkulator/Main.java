public class Main {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        int hasilTambah = calc.tambah(2, 3);
        int hasilKali = calc.kali(4, 6);

        System.out.println("2 + 3 = " + hasilTambah);
        System.out.println("4 * 6 = " + hasilKali);
    }
}

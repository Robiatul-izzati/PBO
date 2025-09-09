import java.util.Scanner;

public class OutputNilai {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int inputSkor;

        while (true) {
            System.out.print("Masukkan nilai (0-100): ");
            inputSkor = inputUser.nextInt();

            if (inputSkor >= 0 && inputSkor <= 100) {
                break;
            } else {
                System.out.println("Nilai yang dimasukkan tidak valid, harus dalam rentang 0 - 100 saja");
            }
        }

        PeriksaNilai penilaian = new PeriksaNilai(inputSkor);

        System.out.println(penilaian.PeriksaLulus());
        System.out.println(penilaian.PeriksaGrade());

        inputUser.close();
    }
}

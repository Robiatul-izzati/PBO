public class PeriksaNilai {
    int skor;

    // Konstruktor
    public PeriksaNilai(int skor) {
        this.skor = skor;
    }

    // kelulusan
    public String PeriksaLulus() {
        if (skor >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    // grade
    public String PeriksaGrade() {
        if (skor >= 85 && skor <= 100) {
            return "Grade: A";
        } else if (skor >= 70 && skor <= 84) {
            return "Grade: B";
        } else if (skor >= 60 && skor <= 69) {
            return "Grade: C";
        } else if (skor >= 50 && skor <= 59) {
            return "Grade: D";
        } else {
            return "Grade: E";
        }
    }
}

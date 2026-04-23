public class Pemain {
    private String nama;
    private int skor;
    private int totalSoalDijawab;

    // Constructor
    public Pemain(String nama) {
        this.nama = nama;
        this.skor = 0;
        this.totalSoalDijawab = 0;
    }

    // Method untuk menambah skor
    public void tambahSkor() {
        this.skor++;
    }

    // Method untuk menambah jumlah soal dijawab
    public void tambahSoalDijawab() {
        this.totalSoalDijawab++;
    }

    // Method untuk menghitung persentase nilai
    public double getPersentase() {
        if (totalSoalDijawab == 0) {
            return 0;
        }
        return (double) skor / totalSoalDijawab * 100;
    }

    
    public String getGrade() {
        double persen = getPersentase();
        if (persen >= 80) {
            return "A - Sangat Baik!";
        } else if (persen >= 60) {
            return "B - Baik";
        } else if (persen >= 40) {
            return "C - Cukup";
        } else {
            return "D - Perlu Belajar Lagi";
        }
    }

    
    public String getNama() {
        return nama;
    }

    public int getSkor() {
        return skor;
    }
}

public class HasilKuis {
    private Pemain pemain;
    private int totalSoal;

    // Constructor
    public HasilKuis(Pemain pemain, int totalSoal) {
        this.pemain = pemain;
        this.totalSoal = totalSoal;
    }

    // Method untuk menampilkan hasil akhir kuis
    public void tampilkanHasil() {
        System.out.println("\n=========================================");
        System.out.println("             HASIL QUIZ                  ");
        System.out.println("=========================================");
        System.out.println("  Nama         : " + pemain.getNama());
        System.out.println("  Total Soal   : " + totalSoal);
        System.out.println("-----------------------------------------");
        System.out.println("  Jawaban Benar  : " + pemain.getSkor());
        System.out.println("  Jawaban Salah  : " + (totalSoal - pemain.getSkor()));
        System.out.println("  Persentase     : " + String.format("%.1f", pemain.getPersentase()) + "%");
        System.out.println("  Grade          : " + pemain.getGrade());
        System.out.println("=========================================");
    }

    // Method untuk menampilkan pesan motivasi
    public void tampilkanPesan() {
        double persen = pemain.getPersentase();
        if (persen == 100) {
            System.out.println("  SEMPURNA! Kamu menjawab semua dengan benar!");
        } else if (persen >= 80) {
            System.out.println("  Hebat! Pengetahuanmu sangat baik!");
        } else if (persen >= 60) {
            System.out.println("  Bagus! Terus tingkatkan lagi ya!");
        } else {
            System.out.println("  Jangan menyerah! Ayo belajar lagi!");
        }
        System.out.println("=========================================");
    }
}

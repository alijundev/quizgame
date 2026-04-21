import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SoalPilihanGanda> daftarSoal = new ArrayList<SoalPilihanGanda>();

        // Tambahkan soal
        daftarSoal.add(new SoalPilihanGanda(
                "Bahasa pemrograman yang dikenal paling mudah dipelajari oleh pemula karena sintaksnya sederhana dan mudah dibaca adalah?",
                new String[]{"A. Python", "B. C++", "C. Java", "D. JavaScript"},
                'A'));

        daftarSoal.add(new SoalPilihanGanda(
                "Bahasa pemrograman untuk Android adalah?",
                new String[]{"A. Java", "B. HTML", "C. C", "D. Kotlin"},
                'A'));

        daftarSoal.add(new SoalPilihanGanda(
                "Apa fungsi dari RAM?",
                new String[]{"A. Menyimpan data permanen", "B. Menyimpan data sementara",
                        "C. Menghitung operasi matematika", "D. Mengontrol perangkat keras"},
                'B'));

        daftarSoal.add(new SoalPilihanGanda(
                "Port default untuk HTTP adalah?",
                new String[]{"A. 21", "B. 25", "C. 80", "D. 443"},
                'C'));

        daftarSoal.add(new SoalPilihanGanda(
                "Apa kepanjangan dari IP?",
                new String[]{"A. Internet Provider", "B. Internal Protocol", "C. Internet Protocol",
                        "D. Intergrated Program"},
                'C'));

        int skor = 0;

        System.out.println("====================================");
        System.out.println("    Selamat datang di Quiz Game!    ");
        System.out.println("====================================");

        // Loop soal
        for (int i = 0; i < daftarSoal.size(); i++) {
            SoalPilihanGanda soal = daftarSoal.get(i);

            System.out.println("\nSoal " + (i + 1) + ": " + soal.getPertanyaan());

            for (String pilihan : soal.getPilihan()) {
                System.out.println(pilihan);
            }

            System.out.print("Masukkan jawaban Anda (A/B/C/D): ");
            char jawabanUser = scanner.next().toUpperCase().charAt(0);

            if (jawabanUser == soal.getJawaban()) {
                System.out.println("Jawaban benar!");
                skor++;
            } else {
                System.out.println("Jawaban salah! Jawaban yang benar adalah: " + soal.getJawaban());
            }
        }

        System.out.println("\n=========================================");
        System.out.println("Quiz selesai! Skor Anda: " + skor + "/" + daftarSoal.size());
        System.out.println("=========================================");

        scanner.close();
    }
}
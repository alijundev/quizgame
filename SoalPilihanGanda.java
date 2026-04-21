public class SoalPilihanGanda extends Soal {
    private String[] pilihan;
    private char jawaban;

    public SoalPilihanGanda(String pertanyaan, String[] pilihan, char jawaban) {
        super(pertanyaan);
        this.pilihan = pilihan;
        this.jawaban = jawaban;
    }

    public String[] getPilihan() {
        return pilihan;
    }

    public char getJawaban() {
        return jawaban;
    }
}
package penilaian;

public class main {
  public static void main(String[] args) {
        // Membuat objek Mahasiswa
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.setNama("Muhammad Zaini Abdurrahman");
        mahasiswa.setNpm("2110010432");
        
        // Membuat objek NilaiAkhir
        NilaiAkhir nilaiAkhir = new NilaiAkhir();
        nilaiAkhir.setUts(80);
        nilaiAkhir.setUas(85);
        nilaiAkhir.setTugas(90);
        
        // Menampilkan informasi mahasiswa dan nilai akhirnya
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
}

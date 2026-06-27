package tugas;

// Nama : Nadia Intania
// NPM  : 2510010500

public class MainTugas {
    public static void main(String[] args) {
        String[] kategori = {"Makanan", "Minuman","Peralatan"};
        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");
        
        gudang.tambahBarang(new Barang("Beras", 15000, 20));
        gudang.tambahBarang(new Barang("Gula", 18000, 15));
        gudang.tambahBarang(new Barang("Kopi", 25000, 10));
        gudang.tambahBarang(new Barang("Teh", 10000, 25));
        gudang.tambahBarang(new Barang("Susu", 12000, 30));
        
        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total Nilai Persediaan: Rp"+ gudangBaru.totalNilai());
    }
}
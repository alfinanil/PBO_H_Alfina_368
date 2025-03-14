// Kelas utama untuk menjalankan program
public class Main_2 {
    public static void main(String[] args) { // Metode utama (entry point) program
        // Membuat objek rekening bank dengan nomor rekening, nama pemilik, dan saldo awal
        RekeningBank rekening1 = new RekeningBank("202410370110368", "Alfina Nil Husna", 5000000);
        RekeningBank rekening2 = new RekeningBank("202410370110372", "Nawa Istiqomah", 6000000); // Nomor rekening diubah agar unik

        // Menampilkan informasi awal kedua rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Menyetor uang ke rekening masing-masing
        rekening1.setorUang(200000); // Alfina menyetor Rp 200.000
        rekening2.setorUang(500000); // Nawa menyetor Rp 500.000

        System.out.println(); // Baris kosong untuk pemisah output

        // Menarik uang dari rekening masing-masing
        rekening1.tarikUang(800000); // Alfina menarik Rp 800.000
        rekening2.tarikUang(200000); // Nawa menarik Rp 200.000

        System.out.println(); // Baris kosong untuk pemisah output

        // Menampilkan informasi saldo setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
// Kelas RekeningBank untuk merepresentasikan rekening bank
class RekeningBank {
    String nomorRekening; // Menyimpan nomor rekening bank
    String namaPemilik;   // Menyimpan nama pemilik rekening
    double saldo;         // Menyimpan saldo rekening dalam bentuk angka desimal

    // Konstruktor untuk menginisialisasi rekening bank dengan nomor, nama pemilik, dan saldo awal
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening; // Menyimpan nomor rekening yang diberikan sebagai parameter
        this.namaPemilik = namaPemilik;     // Menyimpan nama pemilik rekening
        this.saldo = saldo;                 // Menyimpan saldo awal yang diberikan sebagai parameter
    }

    // Metode untuk menampilkan informasi rekening
    void tampilkanInfo() {
        System.out.println("Nomor Rekening : " + nomorRekening); // Menampilkan nomor rekening
        System.out.println("Nama Pemilik  : " + namaPemilik);    // Menampilkan nama pemilik rekening
        System.out.println("Saldo         : Rp " + String.format("%,.0f", saldo)); // Menampilkan saldo dengan format pemisah ribuan
        System.out.println(); // Baris kosong untuk estetika output
    }

    // Metode untuk menyetor uang ke dalam rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambah saldo dengan jumlah yang disetor
        // Menampilkan pesan konfirmasi dengan format pemisah ribuan
        System.out.println(namaPemilik + " menyetor Rp " + String.format("%,.0f", jumlah) +
                ". Saldo sekarang: Rp " + String.format("%,.0f", saldo));
    }

    // Metode untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) { // Mengecek apakah saldo mencukupi untuk penarikan
            // Jika saldo tidak mencukupi, tampilkan pesan gagal
            System.out.println(namaPemilik + " menarik Rp " + String.format("%,.0f", jumlah) +
                    ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp " + String.format("%,.0f", saldo));
        } else {
            saldo -= jumlah; // Mengurangi saldo dengan jumlah yang ditarik jika saldo mencukupi
            // Menampilkan pesan sukses dengan format pemisah ribuan
            System.out.println(namaPemilik + " menarik Rp " + String.format("%,.0f", jumlah) +
                    ". (Berhasil) Saldo sekarang: Rp " + String.format("%,.0f", saldo));
        }
    }
}

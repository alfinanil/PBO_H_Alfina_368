// Kelas Hewan untuk merepresentasikan hewan dengan atribut nama, jenis, dan suara
class Hewan { // Mendefinisikan kelas Hewan yang berisi atribut dan metode terkait hewan
    // Atribut hewan
    String nama;  // Menyimpan nama hewan (misalnya: Kucing, Anjing)
    String jenis; // Menyimpan jenis hewan (misalnya: Mamalia, Reptil, dll.)
    String suara; // Menyimpan suara yang dihasilkan hewan (misalnya: Meow, Woof-Woof)

    // Konstruktor untuk menginisialisasi objek Hewan saat dibuat
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;   // Mengisi atribut nama dengan nilai dari parameter
        this.jenis = jenis; // Mengisi atribut jenis dengan nilai dari parameter
        this.suara = suara; // Mengisi atribut suara dengan nilai dari parameter
    }

    // Metode untuk menampilkan informasi hewan ke layar
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);  // Menampilkan nama hewan
        System.out.println("Jenis : " + jenis); // Menampilkan jenis hewan
        System.out.println("Suara : " + suara); // Menampilkan suara hewan
        System.out.println(); // Menambahkan baris kosong untuk pemisah output
    }
}

// Kelas utama yang berisi metode main untuk menjalankan program
public class Main {
    public static void main(String[] args) { // Metode utama (entry point) program
        // Membuat objek hewan dengan nama, jenis, dan suara masing-masing
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Meow~"); // Objek pertama
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!"); // Objek kedua

        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan pertama
        hewan1.tampilkanInfo();
        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan kedua
        hewan2.tampilkanInfo();
    }
}

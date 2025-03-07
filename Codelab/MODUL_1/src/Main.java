// Mengimpor library Scanner untuk input dari user
import java.util.Scanner;

// Mengimpor library LocalDate untuk mendapatkan tahun saat ini
import java.time.LocalDate;

// Membuat class Mahasiswa
class Mahasiswa {

    // Method untuk menentukan jenis kelamin berdasarkan input karakter
    public String setjenisKelamin(char jenisKelamin) {
        // Jika huruf 'l' atau 'L', berarti Laki-laki
        if (jenisKelamin == 'l' || jenisKelamin == 'L') {
            return "Laki-laki";
            // Jika huruf 'p' atau 'P', berarti Perempuan
        } else if (jenisKelamin == 'p' || jenisKelamin == 'P') {
            return "Perempuan";
        }
        // Jika input tidak valid, kembalikan string kosong
        return "";
    }

    // Method untuk menghitung umur berdasarkan tahun lahir
    public int umur(int tahunLahir) {
        // Mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // Mengambil tahun saat ini
        int thisYear = today.getYear();
        // Menghitung umur (tahun saat ini dikurangi tahun lahir)
        int umur = thisYear - tahunLahir;
        return umur;
    }

    // Method untuk mencetak data lengkap (nama, jenis kelamin, umur)
    public void data(String nama, char jenisKelamin, int tahunLahir) {
        System.out.println("Data Diri: "); // Menampilkan header data diri
        System.out.println("Nama: " + nama); // Menampilkan nama
        // Menampilkan jenis kelamin yang sudah diolah di method setjenisKelamin
        System.out.println("Jenis Kelamin: " + setjenisKelamin(jenisKelamin));
        // Menampilkan umur yang dihitung di method umur
        System.out.println("Umur: " + umur(tahunLahir));
    }
}

// Membuat class utama bernama Main
public class Main {

    // Method utama (entry point program)
    public static void main(String[] args) {
        // Membuat objek Mahasiswa untuk memanggil methodnya nanti
        Mahasiswa data = new Mahasiswa();

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        // Meminta input jenis kelamin (P atau L)
        System.out.print("Masukkan Jenis Kelamin [P/L] : ");
        char jenisKelamin = sc.next().charAt(0);

        // Meminta input tahun lahir
        System.out.print("Masukkan Tahun Lahir : ");
        int tahunLahir = sc.nextInt();

        System.out.println(" "); // Memberikan jarak kosong di output

        // Memanggil method data untuk menampilkan data diri lengkap
        data.data(nama, jenisKelamin, tahunLahir);

        // Menutup Scanner agar tidak terjadi kebocoran resource (best practice)
        sc.close();
    }
}

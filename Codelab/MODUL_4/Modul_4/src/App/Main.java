package App;
import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        //objek buku
        Buku novelFantasi = new Fiksi("Alaia", "Raden Chedid", "Fantasi,Romantis,Komedi ");
        Buku bukuMotivasi = new NonFiksi("The Power Of Habit", "Charles Duhigg", "Motivasi");

        System.out.println("Informasi Buku Perpustakaan:");
        novelFantasi.displayInfo();
        bukuMotivasi.displayInfo();

        //objek anggota
        Anggota anggota1 = new Anggota("Alfina Nil Husna", "H368");
        Anggota anggota2 = new Anggota("Nawa Istiqomah", "H372 ");

        System.out.println("\nAnggota: " + anggota1.getNama() + " (ID: " + anggota1.getIdAnggota() + ")");
        System.out.println("Anggota: " + anggota2.getNama() + " (ID: " + anggota2.getIdAnggota() + ")");

        System.out.println("\n-Peminjaman Buku:");
        anggota1.pinjamBuku("Alaia");
        anggota2.pinjamBuku("The Power Of Habit", 20);

        System.out.println("\n-Pengembalian Buku:");
        anggota1.kembalikanBuku();
        anggota2.kembalikanBuku();
    }
}
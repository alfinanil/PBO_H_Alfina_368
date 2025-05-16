import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Pensil", 50));
        daftarBarang.add(new Barang("Buku", 30));
        daftarBarang.add(new Barang("Penghapus", 20));

        boolean lanjut = true;

        while (lanjut) {
            tampilkanMenu();
            try {
                System.out.print("Pilih opsi [0-3]: ");
                int opsi = scanner.nextInt();
                scanner.nextLine(); // Buang newline

                switch (opsi) {
                    case 1:
                        tambahBarang(scanner, daftarBarang);
                        break;
                    case 2:
                        tampilkanBarang(daftarBarang);
                        break;
                    case 3:
                        kurangiStok(scanner, daftarBarang);
                        break;
                    case 0:
                        lanjut = false;
                        System.out.println("Terima kasih! Program berakhir.");
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine(); // Buang input tidak valid
            }
        }

        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println(">>>> Menu Manajemen Stok <<<<");
        System.out.println(" --- Inventaris Digital ---  ");
        System.out.println("\n1. Tambahkan Barang Baru");
        System.out.println("2. Tampilkan Semua Barang");
        System.out.println("3. Kurangi Stok Barang");
        System.out.println("0. Keluar");
    }

    private static void tambahBarang(Scanner scanner, ArrayList<Barang> daftarBarang) {
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();

        int stok = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Masukkan stok awal: ");
                stok = scanner.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input stok harus berupa angka!");
                scanner.nextLine();
            }
        }

        scanner.nextLine(); // Buang newline
        Barang barangBaru = new Barang(nama, stok);
        daftarBarang.add(barangBaru);
        System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
    }

    private static void tampilkanBarang(ArrayList<Barang> daftarBarang) {
        System.out.println("\n--- Daftar Barang ---");

        if (daftarBarang.isEmpty()) {
            System.out.println("Stok barang kosong.");
            return;
        }

        Iterator<Barang> iterator = daftarBarang.iterator();
        int indeks = 0;
        while (iterator.hasNext()) {
            Barang barang = iterator.next();
            System.out.println(indeks + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
            indeks++;
        }

        System.out.println("----------------------");
    }

    private static void kurangiStok(Scanner scanner, ArrayList<Barang> daftarBarang) {
        System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");

        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang untuk dikurangi stok.");
            return;
        }

        Iterator<Barang> iterator = daftarBarang.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Barang barang = iterator.next();
            System.out.println(i + ". " + barang.getNama() + " (Stok: " + barang.getStok() + ")");
            i++;
        }

        try {
            System.out.print("Masukkan nomor indeks barang: ");
            int indeks = scanner.nextInt();

            if (indeks < 0 || indeks >= daftarBarang.size()) {
                throw new IndexOutOfBoundsException("Indeks tidak valid.");
            }

            System.out.print("Masukkan jumlah stok yang akan diambil: ");
            int jumlahDiambil = scanner.nextInt();

            Barang barang = daftarBarang.get(indeks);

            if (jumlahDiambil > barang.getStok()) {
                throw new StokTidakCukupException("Stok untuk " + barang.getNama() +
                        " hanya tersisa " + barang.getStok());
            }

            barang.setStok(barang.getStok() - jumlahDiambil);
            System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            scanner.nextLine();
        } catch (IndexOutOfBoundsException | StokTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.nextLine(); // Buang newline
    }
}

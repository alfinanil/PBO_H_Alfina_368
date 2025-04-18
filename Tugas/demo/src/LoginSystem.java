import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dummy data admin dan mahasiswa
        Admin admin = new Admin("Admin368", "368", "Admin", "Admin368");
        Mahasiswa mahasiswa = new Mahasiswa("Alfina Nil Husna", "202410370110368");

        System.out.println("===== Sistem Login =====");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // buang newline

        boolean loginBerhasil = false;

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            loginBerhasil = admin.login(username, password);
            if (loginBerhasil) {
                admin.displayInfo();
            } else {
                System.out.println("Login Admin gagal. Username atau password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            loginBerhasil = mahasiswa.login(nama, nim);
            if (loginBerhasil) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal. Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

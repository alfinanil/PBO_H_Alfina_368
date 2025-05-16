package com.praktikum.Main;

import com.praktikum.Users.User;
import com.praktikum.Users.Admin;
import com.praktikum.Users.Mahasiswa;
import java.util.Scanner;

public class LoginSystem {
    private static final Admin admin = new Admin("Admin", "Admin368");
    private static final Mahasiswa mahasiswa = new Mahasiswa("Alfina Nil Husna", "Cihuyy368", "202410370110368");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("=== Pilih Menu Login ===");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (roleChoice == 0) {
                isRunning = false;
                System.out.println("Program berakhir. Terima kasih!");
                continue;
            }

            System.out.print("Username: ");
            String username = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            User user = null;
            boolean loginSuccess = false;

            if (roleChoice == 1) {
                // Login sebagai Admin
                if (admin.login(username, password)) {
                    user = admin;
                    loginSuccess = true;
                }
            } else if (roleChoice == 2) {
                // Login sebagai Mahasiswa
                if (mahasiswa.login(username, password)) {
                    user = mahasiswa;
                    loginSuccess = true;
                }
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            if (loginSuccess) {
                System.out.println("Login berhasil sebagai " + user.getUsername());
                user.displayAppMenu();
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        }

        scanner.close();
    }
}
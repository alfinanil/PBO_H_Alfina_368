package com.praktikum.Users;

import com.praktikum.Actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("3Logout");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Logout berhasil, anda telah keluar!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println("--- Fitur Kelola Barang Belum Tersedia ---");
    }

    @Override
    public void manageUsers() {
        System.out.println("--- Fitur Kelola Mahasiswa Belum Tersedia ---");
    }
}
package com.praktikum.Users;

import com.praktikum.Actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private String nim;

    public Mahasiswa(String username, String password, String nim) {
        super(username, password);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
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
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("3. Logout");
            System.out.print("Pilihan: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
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
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== LAPORKAN BARANG ===");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("Konfirmasi: Laporan barang " + namaBarang + " telah diterima!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println("--- Fitur Lihat Laporan Belum Tersedia ---");
    }
}
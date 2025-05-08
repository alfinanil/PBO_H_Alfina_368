package Perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judulBuku);
    void pinjamBuku(String judulBuku, int durasiPeminjaman);
    void kembalikanBuku();
}
package Perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;
    private String bukuDipinjam;
    private int durasiPinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = null;
        this.durasiPinjam = 0;
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        this.bukuDipinjam = judulBuku;
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku );
    }

    @Override
    public void pinjamBuku(String judulBuku, int durasiPeminjaman) {
        this.bukuDipinjam = judulBuku;
        this.durasiPinjam = 20;
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku +
                " selama " + durasiPinjam + " hari.");
    }

    @Override
    public void kembalikanBuku() {
        if (bukuDipinjam != null) {
            System.out.println(nama + " mengembalikan buku berjudul: " +
                    bukuDipinjam );
            bukuDipinjam = null;
            durasiPinjam = 0;
        } else {
            System.out.println(nama + " tidak sedang meminjam buku apapun.");
        }
    }
}
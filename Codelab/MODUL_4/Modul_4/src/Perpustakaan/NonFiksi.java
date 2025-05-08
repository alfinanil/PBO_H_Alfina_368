package Perpustakaan;

public class NonFiksi extends Buku {
    private String subjek;

    public NonFiksi(String judul, String penulis, String subjek) {
        super(judul, penulis);
        this.subjek = subjek;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== Buku Non-Fiksi ===");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Subjek: " + subjek);
        System.out.println("=====================");
    }
}
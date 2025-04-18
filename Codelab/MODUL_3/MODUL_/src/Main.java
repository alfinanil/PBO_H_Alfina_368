// Kelas utama untuk karakter dalam game
class KarakterGame {
    private String nama; // Nama karakter
    private int kesehatan; // Jumlah kesehatan karakter

    // Konstruktor untuk menginisialisasi karakter dengan nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan jumlah kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Setter untuk mengubah jumlah kesehatan karakter
    // Menggunakan Math.max untuk memastikan kesehatan tidak menjadi negatif
    public void setKesehatan(int kesehatan) {
        this.kesehatan = Math.max(kesehatan, 0);
    }

    // Metode serangan dasar yang akan ditimpa oleh subclass
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + "!");
    }
}

// Kelas Pahlawan yang merupakan subclass dari KarakterGame
class Pahlawan extends KarakterGame {
    // Konstruktor untuk membuat objek pahlawan dengan nama dan kesehatan
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override metode serang untuk pahlawan dengan senjata khusus
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan pedang suci Solarius!");

        // Mengurangi kesehatan target sebesar 20 poin
        target.setKesehatan(target.getKesehatan() - 20);

        // Menampilkan sisa kesehatan target setelah diserang
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Musuh yang merupakan subclass dari KarakterGame
class Musuh extends KarakterGame {
    // Konstruktor untuk membuat objek musuh dengan nama dan kesehatan
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override metode serang untuk musuh dengan serangan sihir
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan sihir kegelapan!");

        // Mengurangi kesehatan target sebesar 15 poin
        target.setKesehatan(target.getKesehatan() - 15);

        // Menampilkan sisa kesehatan target setelah diserang
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas utama untuk menjalankan permainan
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pahlawan bernama Artheon dengan 150 kesehatan
        Pahlawan artheon = new Pahlawan("Artheon", 150);

        // Membuat objek Musuh bernama Malakar dengan 200 kesehatan
        Musuh malakar = new Musuh("Malakar", 200);

        // Menampilkan status awal sebelum pertempuran dimulai
        System.out.println("Pertempuran dimulai!");
        System.out.println(artheon.getNama() + " memiliki kesehatan: " + artheon.getKesehatan());
        System.out.println(malakar.getNama() + " memiliki kesehatan: " + malakar.getKesehatan());

        // Pahlawan menyerang musuh
        artheon.serang(malakar);

        // Musuh menyerang kembali pahlawan
        malakar.serang(artheon);

        // Menampilkan status setelah pertempuran
        System.out.println("Pertempuran berakhir!");
    }
}

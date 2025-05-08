public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {//constractor
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String input1, String input2) {
        return false;
    }

    public void displayInfo() {
        System.out.println("Informasi Pengguna");
    }
}

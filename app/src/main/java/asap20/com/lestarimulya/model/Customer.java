package asap20.com.lestarimulya.model;

public class Customer {

    private int id;
    private String nama;
    private String alamat;
    private double totalTabungan;
    private double totalHutang;

    public Customer() {
    }

    public Customer(int id, String nama, String alamat, double totalTabungan, double totalHutang) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.totalTabungan = totalTabungan;
        this.totalHutang = totalHutang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getTotalTabungan() {
        return totalTabungan;
    }

    public void setTotalTabungan(double totalTabungan) {
        this.totalTabungan = totalTabungan;
    }

    public double getTotalHutang() {
        return totalHutang;
    }

    public void setTotalHutang(double totalHutang) {
        this.totalHutang = totalHutang;
    }
}

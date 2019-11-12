package asap20.com.lestarimulya.model;

public class Barang {
    private int id;
    private String namaBarang;
    private double hargaBarang;

    public Barang() {
    }

    public Barang(int id, String namaBarang, double hargaBarang) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
}

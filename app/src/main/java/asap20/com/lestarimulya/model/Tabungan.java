package asap20.com.lestarimulya.model;

public class Tabungan {

    private int idTabungan;
    private String namaCustomer;
    private String tanggal;
    private double jumlahTabung;

    public Tabungan() {
    }

    public Tabungan(int idTabungan, String namaCustomer, String tanggal, double jumlahTabung) {
        this.idTabungan = idTabungan;
        this.namaCustomer = namaCustomer;
        this.tanggal = tanggal;
        this.jumlahTabung = jumlahTabung;
    }

    public int getIdTabungan() {
        return idTabungan;
    }

    public void setIdTabungan(int idTabungan) {
        this.idTabungan = idTabungan;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public double getJumlahTabung() {
        return jumlahTabung;
    }

    public void setJumlahTabung(double jumlahTabung) {
        this.jumlahTabung = jumlahTabung;
    }
}

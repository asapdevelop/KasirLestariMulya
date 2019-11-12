package asap20.com.lestarimulya.model;

public class TarikTunai {

    private int idTarik;
    private String namaCustomer;
    private String tanggal;
    private double jumlahTarik;

    public TarikTunai() {
    }

    public TarikTunai(int idTarik, String namaCustomer, String tanggal, double jumlahTarik) {
        this.idTarik = idTarik;
        this.namaCustomer = namaCustomer;
        this.tanggal = tanggal;
        this.jumlahTarik = jumlahTarik;
    }

    public int getIdTarik() {
        return idTarik;
    }

    public void setIdTarik(int idTarik) {
        this.idTarik = idTarik;
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

    public double getJumlahTarik() {
        return jumlahTarik;
    }

    public void setJumlahTarik(double jumlahTarik) {
        this.jumlahTarik = jumlahTarik;
    }
}

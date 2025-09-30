package model;

public abstract class Resep implements InfoResep{
    protected String namaMasakan;
    protected String bahanUtama;
    protected int lamaMemasak;
    protected String kategori;
    protected String bahanPelengkap;
    
    public Resep(String namaMasakan, String bahanUtama, int lamaMemasak, String kategori) {
        this.namaMasakan = namaMasakan;
        this.bahanUtama = bahanUtama;
        this.lamaMemasak = lamaMemasak;
        this.kategori = kategori;
    }
    public Resep(String namaMasakan, String bahanUtama, int lamaMemasak, String bahanPelengkap, String kategori) {
        this.namaMasakan = namaMasakan;
        this.bahanUtama = bahanUtama;
        this.lamaMemasak = lamaMemasak;
        this.kategori = kategori;
        this.bahanPelengkap = bahanPelengkap;
    }
    
    public String getNamaMasakan() {
        return namaMasakan;
    }

    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }

    public int getLamaMemasak() {
        return lamaMemasak;
    }

    public void setLamaMemasak(int lamaMemasak) {
        this.lamaMemasak = lamaMemasak;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public abstract void prosesMemasak();
    
    @Override
    public String toString() {
    return namaMasakan +
           (bahanPelengkap != null ? " dengan " + bahanPelengkap : "") +
           " | Kategori: " + kategori +
           " | Bahan: " + bahanUtama +
           " | Lama: " + lamaMemasak + " menit";
    }
}
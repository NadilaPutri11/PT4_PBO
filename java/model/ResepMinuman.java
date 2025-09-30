package model;

public class ResepMinuman extends Resep {
    public ResepMinuman(String namaMasakan, String bahanUtama, int lamaMemasak) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Minuman");
    }

    public ResepMinuman(String namaMasakan, String bahanUtama, int lamaMemasak, String bahanPelengkap) {
        super(namaMasakan, bahanUtama, lamaMemasak, bahanPelengkap, "Minuman");
    }
    
    @Override
    public void prosesMemasak() {
        System.out.println("Membuat minuman " + getNamaMasakan() + " dengan bahan utama " + getBahanUtama());
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(toString());
    }
}
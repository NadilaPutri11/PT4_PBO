package model;

public class ResepMinuman extends Resep {
    public ResepMinuman(String namaMasakan, String bahanUtama, int lamaMemasak) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Minuman");
    }

    public ResepMinuman(String namaMasakan, String bahanUtama, int lamaMemasak, String bahanPelengkap) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Minuman", bahanPelengkap);
    }
    
    @Override
    public void prosesMemasak() {
        if (bahanPelengkap != null) {
            System.out.println("Membuat minuman " + getNamaMasakan() + 
                " dengan bahan utama " + getBahanUtama() + 
                " dan tambahan " + bahanPelengkap);
        } else {
            System.out.println("Membuat minuman " + getNamaMasakan() + 
                " dengan bahan utama " + getBahanUtama());
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(toString());
    }
}
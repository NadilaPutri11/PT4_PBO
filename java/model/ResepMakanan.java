package model;

public class ResepMakanan extends Resep {
    public ResepMakanan(String namaMasakan, String bahanUtama, int lamaMemasak) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Makanan");
    }

    public ResepMakanan(String namaMasakan, String bahanUtama, int lamaMemasak, String bahanPelengkap) {
        super(namaMasakan, bahanUtama, lamaMemasak, "Makanan", bahanPelengkap);
    }
    @Override
    public void prosesMemasak() {
    System.out.println("Memasak makanan " + getNamaMasakan() + " dengan bahan utama " + getBahanUtama());
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println(toString());
    }
}
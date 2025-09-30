package service;

import java.util.ArrayList;
import model.Resep;

public class resepservice {
    
    private ArrayList<Resep> daftarResep = new ArrayList<>();
    
    private boolean cekKosong(String pesan) {
        if (daftarResep.isEmpty()) {
            System.out.println(pesan);
            return true;
        }
        return false;
    }
    
    // CRUD
    public void tambahResep(Resep dataResep) {
        daftarResep.add(dataResep);
        System.out.println("Resep berhasil ditambahkan!");
    }
    
    public void lihatResep() {
        if (daftarResep.isEmpty()) {
            System.out.println("Belum ada resep tersimpan.");
        } else {
            System.out.println("=== Daftar Resep ===");
            for (int i = 0; i < daftarResep.size(); i++) {
                System.out.println((i + 1) + ". " + daftarResep.get(i));
            }
        }
    }
    
    public void ubahResep(int index, Resep resepDiperbarui) {
        if (index >= 0 && index < daftarResep.size()) {
            daftarResep.set(index, resepDiperbarui);
            System.out.println("Resep berhasil diubah!");
        } else {
            System.out.println("Nomor resep tidak valid.");
        }
    }
    
    public void hapusResep(int index) {
        if (daftarResep.isEmpty()) {
            System.out.println("Belum ada resep untuk dihapus.");
            return;
        }
        if (index >= 0 && index < daftarResep.size()) {
            daftarResep.remove(index);
            System.out.println("Resep berhasil dihapus!");
        } else {
            System.out.println("Nomor resep tidak valid.");
        }
    }
    
    public void cariResep(String keyword) {
        boolean ditemukan = false;
        for (Resep resep : daftarResep) {
            if (resep.getNamaMasakan().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(resep);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Resep dengan kata kunci \"" + keyword + "\" tidak ditemukan.");
        }
    }
    
    // Method tambahan
    public boolean isEmpty() {
        return daftarResep.isEmpty();
    }
    
    public int getJumlahResep() {
        return daftarResep.size();
    }
    
    public Resep getResep(int index) {
        if (index >= 0 && index < daftarResep.size()) {
            return daftarResep.get(index);
        } else {
            return null;
        }
    }
}
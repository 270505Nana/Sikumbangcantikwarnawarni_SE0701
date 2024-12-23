package Departemen;

import gaji.Gaji;
import karyawan.Karyawan;
import proyek.Proyek;
import java.util.ArrayList;
import java.util.List;

public abstract class Departemen {

    private String namaDepartemen;
    private List<Karyawan> karyawanList;
    private List<Proyek> proyekList;
    private Gaji sistemGaji;

    public Departemen(String namaDepartemen, Gaji sistemGaji) {
        this.namaDepartemen = namaDepartemen;
        this.karyawanList = new ArrayList<>();
        this.proyekList = new ArrayList<>();
        this.sistemGaji = sistemGaji;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public List<Proyek> getProyekList() {
        return proyekList;
    }

    public void tambahKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
        System.out.println("Karyawan " + karyawan.getNama() + " berhasil ditambahkan ke departemen " + namaDepartemen);
    }

    public void hapusKaryawan(int id) {
        Karyawan karyawanDihapus = null;
        for (Karyawan karyawan : karyawanList) {
            if (karyawan.getId() == id) {
                karyawanDihapus = karyawan;
                break;
            }
        }
        if (karyawanDihapus != null) {
            karyawanList.remove(karyawanDihapus);
            System.out.println("Karyawan dengan ID " + id + " berhasil dihapus dari departemen " + namaDepartemen);
        } else {
            System.out.println("Karyawan dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void tampilkanKaryawan() {
        System.out.println("\nDepartemen: " + namaDepartemen);
        System.out.println("Daftar Karyawan:");
        if (karyawanList.isEmpty()) {
            System.out.println("Tidak ada karyawan.");
            return;
        }

        System.out.printf("%-10s %-20s %-15s Rp%-10s%n", "ID", "Nama", "Status", "Gaji");
        System.out.println("=".repeat(50));
        for (Karyawan karyawan : karyawanList) {
            double gaji = sistemGaji.hitungGaji(karyawan);
            System.out.printf("%-10d %-20s %-15s Rp%-10.2f%n",
                    karyawan.getId(), karyawan.getNama(), karyawan.getStatus(), gaji);
        }
    }

     public void tambahProyek(Proyek proyek) {
        proyekList.add(proyek);
        System.out.println("Proyek " + proyek.getNamaProyek() + " berhasil ditambahkan ke departemen " + namaDepartemen);
    }

    public void tampilkanProyek() {
        System.out.println("\nDaftar Proyek di Departemen: " + namaDepartemen);
        if (proyekList.isEmpty()) {
            System.out.println("Tidak ada proyek yang terdaftar.");
            return;
        }

        for (Proyek proyek : proyekList) {
            System.out.println("Proyek: " + proyek.getNamaProyek());
            System.out.println("Durasi: " + proyek.getDurasi());
            System.out.println("Anggota Proyek:");
            for (Karyawan karyawan : proyek.getKaryawanList()) {
                System.out.println("- " + karyawan.getNama());
            }
            System.out.println("=".repeat(50));
        }
    }
}

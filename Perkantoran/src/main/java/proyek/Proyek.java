package proyek;

import karyawan.Karyawan;
import java.util.ArrayList;
import java.util.List;

public class Proyek {
    private String namaProyek;
    private String durasi;
    private List<Karyawan> karyawanList;

    public Proyek(String namaProyek, String durasi) {
        this.namaProyek = namaProyek;
        this.durasi = durasi;
        this.karyawanList = new ArrayList<>();
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public String getDurasi() {
        return durasi;
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }

    public void addKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }
}
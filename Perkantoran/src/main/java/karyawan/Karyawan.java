package karyawan;

public class Karyawan {
    private int id;
    private String nama;
    private String status;
    private String email;
    private String telepon;
    private String jabatan;

    public Karyawan(int id, String nama, String status, String email, String telepon, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.status = status;
        this.email = email;
        this.telepon = telepon;
        this.jabatan = jabatan;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getJabatan() {
        return jabatan;
    }
}
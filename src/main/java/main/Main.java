package main;

import Departemen.DepartemenAccounting;
import Departemen.DepartemenHRD;
import Departemen.DepartemenIT;
import Departemen.DepartemenMarketing;
import Departemen.DepartemenContentCreator;
//import departemen.*;
import karyawan.Karyawan;
import proyek.Proyek;

import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DepartemenAccounting accounting = new DepartemenAccounting();
        DepartemenHRD hrd = new DepartemenHRD();
        DepartemenIT it = new DepartemenIT();
        DepartemenMarketing marketing = new DepartemenMarketing();
        DepartemenContentCreator contentcreator = new DepartemenContentCreator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================<Menu Manajemen Karyawan>============================");
            System.out.println("\n1. Tambah Karyawan\n2. Tampilkan Karyawan\n3. Tambah Proyek\n4. Tampilkan Proyek\n5.Hapus karyawan\n6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Nama Karyawan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Status (Tetap/Intern): ");
                    String status = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telepon: ");
                    String telepon = scanner.nextLine();
                    System.out.print("Jabatan: ");
                    String jabatan = scanner.nextLine();

                    System.out.println("1. Accounting\n2. HRD\n3. IT\n4. Marketing\n5. Content creator");
                    System.out.print("Pilih Departemen: ");
                    int dept = scanner.nextInt();

                    Karyawan karyawan = new Karyawan((int) (Math.random() * 1000), nama, status, email, telepon, jabatan);
                    switch (dept) {
                        case 1 ->
                            accounting.tambahKaryawan(karyawan);
                        case 2 ->
                            hrd.tambahKaryawan(karyawan);
                        case 3 ->
                            it.tambahKaryawan(karyawan);
                        case 4 ->
                            marketing.tambahKaryawan(karyawan);
                        case 5 ->
                            contentcreator.tambahKaryawan(karyawan);
                    }
                }
                case 2 -> {
                    accounting.tampilkanKaryawan();
                    hrd.tampilkanKaryawan();
                    it.tampilkanKaryawan();
                    marketing.tampilkanKaryawan();
                    contentcreator.tampilkanKaryawan();
                }
//                    Proyek proyek = new Proyek(namaProyek, durasi);

                case 3 -> {
                    System.out.print("Nama Proyek: ");
                    String namaProyek = scanner.nextLine();
                    System.out.print("Durasi Proyek: ");
                    String durasi = scanner.nextLine();
                    scanner.nextLine();

                    System.out.println("Pilih Departemen untuk Tambahkan Proyek:");
                    System.out.println("1. Accounting");
                    System.out.println("2. HRD");
                    System.out.println("3. IT");
                    System.out.println("4. Marketing");
                    System.out.println("5. Content Creator");
                    System.out.print("Pilihan: ");
                    int pilihanDepartemen = scanner.nextInt();
                    scanner.nextLine();

                    Proyek proyekBaru = new Proyek(namaProyek, durasi);

                    System.out.print("Masukkan jumlah karyawan yang terlibat: ");
                    int jumlahKaryawan = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahKaryawan; i++) {
                        System.out.print("Masukkan ID Karyawan yang terlibat: ");
                        int idKaryawan = scanner.nextInt();
                        scanner.nextLine();

                        List<Karyawan> karyawanList = switch (pilihanDepartemen) {
                            case 1 ->
                                accounting.getKaryawanList();
                            case 2 ->
                                hrd.getKaryawanList();
                            case 3 ->
                                it.getKaryawanList();
                            case 4 ->
                                marketing.getKaryawanList();
                            case 5 ->
                                contentcreator.getKaryawanList();
                            default ->
                                null;
                        };

                        if (karyawanList != null) {
                            for (Karyawan karyawan : karyawanList) {
                                if (karyawan.getId() == idKaryawan) {
                                    proyekBaru.addKaryawan(karyawan);
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Departemen tidak valid.");
                        }
                    }

                    switch (pilihanDepartemen) {
                        case 1 ->
                            accounting.tambahProyek(proyekBaru);
                        case 2 ->
                            hrd.tambahProyek(proyekBaru);
                        case 3 ->
                            it.tambahProyek(proyekBaru);
                        case 4 ->
                            marketing.tambahProyek(proyekBaru);
                        case 5 ->
                            contentcreator.tambahProyek(proyekBaru);
                        default ->
                            System.out.println("Pilihan departemen tidak valid!");
                    }
                }

                case 4 -> {
                    accounting.tampilkanProyek();
                    hrd.tampilkanProyek();
                    it.tampilkanProyek();
                    marketing.tampilkanProyek();
                    contentcreator.tampilkanProyek();
                }
                case 5 -> {
                    System.out.println("Pilih Departemen untuk Hapus Karyawan:");
                    System.out.println("1. Accounting");
                    System.out.println("2. HRD");
                    System.out.println("3. IT");
                    System.out.println("4. Marketing");
                    System.out.println("5. Content Creator");
                    System.out.print("Pilihan: ");
                    int pilihanDepartemen = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan ID Karyawan yang ingin dihapus: ");
                    int idKaryawan = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilihanDepartemen) {
                        case 1 ->
                            accounting.hapusKaryawan(idKaryawan);
                        case 2 ->
                            hrd.hapusKaryawan(idKaryawan);
                        case 3 ->
                            it.hapusKaryawan(idKaryawan);
                        case 4 ->
                            marketing.hapusKaryawan(idKaryawan);
                        case 5 ->
                            contentcreator.hapusKaryawan(idKaryawan);
                        default ->
                            System.out.println("Pilihan departemen tidak valid!");
                    }
                }
                case 6 -> {
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}



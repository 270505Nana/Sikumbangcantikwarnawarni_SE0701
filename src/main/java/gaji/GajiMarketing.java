package gaji;
import karyawan.Karyawan;


public class GajiMarketing extends Gaji {
    @Override
    public double hitungGaji(Karyawan karyawan) {
        return karyawan.getStatus().equalsIgnoreCase("Tetap") ? 6000000 : 3000000;
    }
}
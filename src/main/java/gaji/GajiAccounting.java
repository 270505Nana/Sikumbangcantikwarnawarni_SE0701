package gaji;
import karyawan.Karyawan;
public class GajiAccounting extends Gaji {
    @Override
    public double hitungGaji(Karyawan karyawan) {
        return karyawan.getStatus().equalsIgnoreCase("Tetap") ? 4000000 : 2500000;
    }
}
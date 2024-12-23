package gaji;
import karyawan.Karyawan;

public class GajiHRD extends Gaji {
    @Override
    public double hitungGaji(Karyawan karyawan) {
        return karyawan.getStatus().equalsIgnoreCase("Tetap") ? 7000000 : 5000000;
    }
}

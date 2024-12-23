package gaji;
import karyawan.Karyawan;

public class GajiIT extends Gaji {
    @Override
    public double hitungGaji(Karyawan karyawan) {
        return karyawan.getStatus().equalsIgnoreCase("Tetap") ? 8000000 : 6000000;
    }
}

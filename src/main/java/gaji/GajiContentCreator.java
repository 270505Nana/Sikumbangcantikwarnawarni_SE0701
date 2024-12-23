package gaji;
import karyawan.Karyawan;

//import com.mycompany.perkantoran.Karyawan;

public class GajiContentCreator extends Gaji {
    @Override
    public double hitungGaji(Karyawan karyawan) {
        return karyawan.getStatus().equalsIgnoreCase("Tetap") ? 6000000 : 3000000;
    }
}
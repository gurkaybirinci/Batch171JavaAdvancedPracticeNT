package practice05.s03_encapsulation;

public class Arac {
    private String marka;
    private String model;
    private String yakitTuru;
    private double gunlukKiraUcreti;

    public Arac(String marka, String model, String yakitTuru, double gunlukKiraUcreti) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.gunlukKiraUcreti = gunlukKiraUcreti;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public double getGunlukKiraUcreti() {
        return gunlukKiraUcreti;
    }

    public void setGunlukKiraUcreti(double gunlukKiraUcreti) {
        this.gunlukKiraUcreti = gunlukKiraUcreti;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", gunlukKiraUcreti=" + gunlukKiraUcreti +
                '}';
    }
}

package practice03.s07_constructor_ogrenci;

public class Ogrenci {
    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın bir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.
    */

    public String ad;
    public int yas;
    public int sinif;

    public Ogrenci() {
        ad = "";
        yas = 0;
        sinif = 0;
    }

    public Ogrenci(String ad, int yas, int sinif) {
        this.ad = ad;
        this.yas = yas;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return  "Ad='" + ad + '\'' +
                ", Yas=" + yas +
                ", Sınıf=" + sinif;
    }

}

package practice03.s07_constructor_ogrenci;

public class Ogrenci_Runner {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.ad = "Ali";
        ogrenci1.yas = 10;
        ogrenci1.sinif = 5;
        System.out.println(ogrenci1);

        Ogrenci ogrenci2 = new Ogrenci("Ahmet", 12, 7);
        System.out.println(ogrenci2);

        // Alıştırma: Bir öğrencinin adını ve sınıfını güncelleyin ve değerlerini ekrana yazdırın
        ogrenci2.ad = "Mehmet";
        System.out.println(ogrenci2);
    }
}

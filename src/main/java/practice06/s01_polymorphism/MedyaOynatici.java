package practice06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        Medya medya = new Medya("Ses Dosyasi.mp3");
        System.out.println("Medya" + medya.toString());

        Medya medya1 = new Medya("Ses Dosyası 2.mp3");
        System.out.println("Medya1" + medya1);

        medya.setDosyaAdi("Sadece Sitem.mp3");
        System.out.println("Medya" + medya);

        System.out.println(medya.getDosyaAdi());

        SesDosyasi sd = new SesDosyasi("Yeni Dosya.mp3");
        sd.oynat();
    }
}

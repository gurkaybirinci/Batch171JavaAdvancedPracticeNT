package practice05.s01_inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    double hesapBakiyesi;

    public Musteri(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAdi;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatirma(double para){
        hesapBakiyesi += para;
        System.out.println("Hesabınıza " + para + " TL eklendi.");
        System.out.println("Yeni hesap bakiyeniz: " + hesapBakiyesi + " TL'dir.");
    }

    public void paraCekme(double para){
        if (hesapBakiyesi >= para){
            hesapBakiyesi -= para;
            System.out.println("Hesabınızdan " + para + " TL çekilmiştir.");
            System.out.println("Yeni hesap bakiyeniz: " + hesapBakiyesi + " TL'dir.");
        }else {
            System.out.println("Hesap bakiyeniz yeterli değildir.");
            System.out.println("Hesabınızda " + hesapBakiyesi + " TL bulunmaktadır.");
        }
    }

    @Override
    public String toString() {
        return  "\n\tMüşteri Adı: " + musteriAdi +
                "\n\tMüşteri No: " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi;
    }
}

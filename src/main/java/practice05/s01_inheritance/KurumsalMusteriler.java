package practice05.s01_inheritance;

public class KurumsalMusteriler extends Musteri{
    String vergiNo;
    String sirketAdi;

    public KurumsalMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
    }

    @Override
    public String toString() {
        return "Kurumsal Müşteriler:" +
                super.toString() +
                "\n\tVergi No: " + vergiNo +
                "\n\tŞirket Adı: " + sirketAdi;
    }
}

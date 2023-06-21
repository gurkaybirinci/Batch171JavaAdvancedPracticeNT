package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimUygulamasi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1985, 03, 15);

        BireyselMusteriler bm = new BireyselMusteriler(
                "Ali Can",
                1234578,
                2000,
                "321654987989",
                dogumTarihi);

        System.out.println(bm.toString());

        bm.paraCekme(2000);


    }
}

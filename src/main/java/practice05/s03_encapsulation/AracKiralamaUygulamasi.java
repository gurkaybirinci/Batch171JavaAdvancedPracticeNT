package practice05.s03_encapsulation;

public class AracKiralamaUygulamasi {
    public static void main(String[] args) {
        Arac arac1 = new Arac("Honda", "Civic", "Tüplü", 500);

        System.out.println(arac1);

        arac1.setGunlukKiraUcreti(600);

        System.out.println(arac1);

        System.out.println(arac1.getMarka());
    }
}

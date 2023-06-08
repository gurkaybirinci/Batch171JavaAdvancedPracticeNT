package practice03;

public class S05_MethodOverloading_Kargo {
    /*
        İki farklı method oluşturun.
          - İlk method, bir paketin ağırlığını parametre olarak alacak ve kargo ücretini hesaplayıp döndürecek.
          - İkinci method ise bir paketin ağırlığı ve boyutları parametrelerini alacak ve
            bu bilgilere göre kargo ücretini hesaplayıp döndürecek.
        Bu methodları kullanarak farklı paketlerin kargo ücretlerini hesaplayın.
    */

    public static void main(String[] args) {
        double kargoUcreti1 = kargoHesapla(7.2);
        System.out.println(kargoUcreti1);

        double kargoUcreti2 = kargoHesapla(11.5, 6.7);
        System.out.println(kargoUcreti2);
    }

    public static double kargoHesapla(double agirlik){
        double kargoUcreti = agirlik * 3.5;
        return kargoUcreti;
    }

    public static double kargoHesapla(double agirlik, double boyut){
        double kargoUcreti = agirlik * 3.5 + boyut * 1.5;
        return kargoUcreti;
    }

}
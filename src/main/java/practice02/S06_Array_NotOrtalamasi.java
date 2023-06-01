package practice02;

public class S06_Array_NotOrtalamasi {
    /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
    */

    public static void main(String[] args) {
        int[] notlar = {84, 91, 76, 85, 98};

        int toplam = 0;

        for (int not : notlar){
            toplam += not;
        }

        double ortalama = (double) toplam / notlar.length;
        System.out.println(ortalama);
    }

}

package practice04;

import java.util.Scanner;

public class S05_StringBuilder_FaktoriyelHesaplama {
    /*
        Bir öğrenci, matematik dersinde, verilen bir sayının faktöriyelini hesaplamak için bir program yazmak istiyor.
        Program, kullanıcıdan bir sayı girmesini isteyecek ve faktöriyel hesaplama işlemini gerçekleştirecektir.
        Kullanıcının girdiği sayı 20'den küçük veya eşit olacaktır.
        Faktöriyel hesaplama işlemi tamamlandıktan sonra sonucu ekrana yazdıracaktır.
    */

    public static void main(String[] args) {
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz (20'den küçük veya eşit olsun): ");
        int sayi = input.nextInt();

        if (sayi <= 20){
            StringBuilder sonuc = new StringBuilder();
            sonuc.append(sayi).append("! = ");

            int faktoriyel = 1;
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
                sonuc.append(i);
                if (i != sayi){
                    sonuc.append(" * ");
                }
            }
            sonuc.append(" = ").append(faktoriyel);
            System.out.println(sonuc);
        }else {
            System.out.println("Geçersiz bir değer girdiniz. Sayı, 20'den küçük veya eşit olmalı.");
        }
    }
}















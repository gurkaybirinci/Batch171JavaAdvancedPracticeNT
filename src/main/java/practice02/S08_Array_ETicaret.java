package practice02;

public class S08_Array_ETicaret {
    /*
        Bir e-ticaret uygulamasında, bir kullanıcının sepetindeki ürünleri bir array'de tutuyorsunuz.
        Kullanıcının sepetinde belirli bir ürünün olup olmadığını kontrol edin.
        {"Telefon", "Bilgisayar", "Klavye", "Mouse"}
    */

    public static void main(String[] args) {
        String [] urunler = {"Telefon", "Bilgisayar", "Klavye", "Mouse"};

        String arananUrun = "Klavye";

        boolean urunVarMi = false;
        for (String urun : urunler){
            if (urun.equals(arananUrun)){
                urunVarMi = true;
                break;
            }
        }

        if (urunVarMi){
            System.out.println("Sepetinizde " + arananUrun + "bulunmaktadır.");
        }else {
            System.out.println("Sepetinizde " + arananUrun + "bulunmamaktadır.");
        }

    }
}

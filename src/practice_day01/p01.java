package practice_day01;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class p01 {
    public static void main(String[] args) {
        System.out.println("Merhaba Java");
        System.out.println("Hello World");//ln stringi asaga gecirir.
        System.out.print("yazdirma fonksiyonu-");//print alt satira gecmez
        System.out.println("merhaba");

        //konsola "Hello Java Ben Geldim "
        System.out.println("Hello Java Ben Geldim");
        System.out.println("\"Hello Java Ben Geldim\"");
        /*
        /"       : cift tirnak isareti yazdirir
        /'       : Tek tirnak isareti yazdirir
        /n or /r : Kendinden sonra gelen metni bir alt satirsan baslatir
        /t       : Kendinden sonra bir TAB bosluk birakir

         */
        System.out.println("");
        System.out.println("\'Hello Wise\'");
        System.out.println();
        System.out.println("Hello Wise\nHave a nice day!");
        System.out.println("Hello Java\nSen neymişsin be abi!");
        System.out.println();
        System.out.println("Hello Wise\t\t\t\t\tHello Future");



       // System.err.println("Hayat guzeldir");
        System.err.println();// serr kirmizi yazdirir konsola
        //konsola
        //deger atayarak
        // Gulsah OZKAN - Software Development Engineer in TEST
        String name = "Gulsah ";
        String surname = " OZKAN";
        String job = " - Software Development Engineer in TEST";
        System.out.println(name+surname+job);

        /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
         */





    }

}

package practice_day07;

import java.util.Scanner;

public class multiDimensional02 {
    public static void main(String[] args) {
        // 5x2'lik bir multidimension [ Her birinin icinde 2 li eleman bulunduran 5 elemenli array]
        // array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
        // Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.

        String[][] sehirlerNufuslar = {
                {"Ankara", "5.000.000"},
                {"Kirikkale", "277.000"},
                {"Adana", "2.000.000"},
                {"Elazig", "450.000"},
                {"Amsterdam", "1.100.000"}


        };

        Scanner sehir = new Scanner(System.in);
        System.out.println("Nufusunu ogrenmek istediginiz sehri yaziniz:");
        String arananSehir = sehir.next();

        boolean kontrol = false;
        for (int i = 0; i < sehirlerNufuslar.length; i++) {
            if (arananSehir.equalsIgnoreCase(sehirlerNufuslar[i][0])) {
                System.out.println(arananSehir + " sehrinin nufusu: " + sehirlerNufuslar[i][1]);
                kontrol = true;
                break;
            }
        }

        if (!kontrol) {

            System.out.println("Giridiginiz sehrin nufusu datalarimizda mevcut degildir");
        }
    }
}
package practice_day06;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        //SORU -1:
        // Çarpım tablosunu ekrana yazdıran bir program yazın
        // (örneğin 1x1'den 10x10'a kadar).

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");

            }
        }


    /*
    Soru 2:
     Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
        int n= scan.nextInt();;
        for (int i = 1; i <n; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }

        }

    }
}
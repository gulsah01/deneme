package practice_day06;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        /*
       Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Baslangic degeri giriniz: ");
        int baslangicDegeri= scan.nextInt();
        System.out.print("Lutfen Bitis degeri giriniz:  ");
        int bitisDegeri= scan.nextInt();
        int toplam =0;

        if (bitisDegeri<baslangicDegeri){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz: ");
        }else {
            for (int i = baslangicDegeri; i <=bitisDegeri ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }


    }
}

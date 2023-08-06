package practice_day07;
import java.util.ArrayList;
import java.util.Scanner;
public class forEachLoop2 {
    public static void main(String[] args) {

         /*
         Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
         Bu fiyatların toplamını hesaplayarak ekrana yazdırın.
         Örnek çıktı:
         Toplam fiyat: 236.5
          */


        ArrayList<Double> fiyatlar=new ArrayList<>();
        System.out.println("1. urun :");
        Scanner scanner=new Scanner(System.in);
        double urun1=scanner.nextDouble();
        fiyatlar.add(urun1);
        System.out.println("2. urun :");
        double urun2=scanner.nextDouble();
        fiyatlar.add(urun2);
        System.out.println("3. urun :");
        double urun3=scanner.nextDouble();
        fiyatlar.add(urun3);

        double toplam=0;
        for (double each:fiyatlar
             ) {
            toplam+=each;
        }
        System.out.println("Urunlerin toplam fiyati: "+ toplam);

    }
}

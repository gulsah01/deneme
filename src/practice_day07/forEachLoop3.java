package practice_day07;
import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop3 {
    public static void main(String[] args) {
// Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
// Bu notların ortalamasını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Notların ortalaması: 78.5

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ders notlarini giriniz");
        ArrayList<Double> ortalama=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.print((i+1)+". ders notu : ");
            double notlar=scanner.nextDouble();
            ortalama.add(notlar);
        }
        double toplam=0;
        for (double each:ortalama
        ) {
        toplam+=each;

        }
       double sinavOrtalamasi=toplam/ortalama.size();
        System.out.print("Sinav Ortalamasi :"+sinavOrtalamasi);
        }
    }


package practice_day07;
import java.util.ArrayList;

public class ArrayList02 {
        /*
        // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
// Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.

// Örnek çıktı:
// Son isim: Ahmet
// Son ikinci isim: Mehmet
// ...
         */

        public static void main(String[] args) {

        ArrayList<String> isimler =new ArrayList<>();
        isimler.add("Mine");
        isimler.add("Berrin");
        isimler.add("Gulsum");
        isimler.add("Nevra");
        isimler.add("Seda");


            for (int i = isimler.size()-1; i >=0 ; i--) {
                System.out.println("Sondan basa yeni liste : "+(isimler.size()-i)+". isim "+isimler.get(i));


            }

            }


        }





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
            ArrayList<String> isimler2=new ArrayList<>();
            isimler2.add("Burhan");
            isimler2.add("Resul");
            isimler2.add("Nergiz");
            isimler2.add("Ömer Faruk");
            isimler2.add("Afife");
            for (int i = isimler2.size()-1; i >=0 ; i--) {
                System.out.println("Sondan "+(isimler2.size()-i)+". isim "+isimler2.get(i));

        }

    }
}


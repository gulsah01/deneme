package practice_day07;

public class multuDimensional {
    public static void main(String[] args) {
        /*
        Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
 bir program yapmanız gerekmektedir. Her öğrenci için
 iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
 kullanmanız gerekmektedir. öğrencilere ait notları ve dönem ortalamasını hesaplayan
  Java programını yazınız:
         */
        //MultiDimensional Array: ic ice array arr={{5. sinif ogrencileri},{6.sinif ogrencileri}}
        // arr={{{5a],{5b}.{5c}}{{6a},{6b}}}
        // [][]; coklu array tanimlamasidir.her array icin bir[] kullanilir.


        // sinav notlari her bir ogrenci inin her bir dobem notunu ekleyecegimiz ic ice array olusturalim
        int[][] sinavNotlari={
                {80,100},// birinci ogrencinin donem notlari
                {75,90},
                {100,100},
                {60,60},
                {30,90}
        };

        for (int i = 0; i <sinavNotlari.length ; i++) {
            int ilkDonemNotu = sinavNotlari[i][0];
            int ikinciDonemNotu =sinavNotlari[i][1];
            System.out.println((i+1)+". Öğrencinin notları"); //index 0'dan başladığı için index'i sıfır olan öğrenci 1. öğrencidir
            //28.satırda iç içe arraylar'i çağırıyoruz
            //{{0,1,2,3,4},{0,1,2,3},{0,1}}  [0][3]---> 3
            //{{ali,murat,hakan,ahmet,musatafa},.... } [0][3]----> ahmet
            System.out.println("Birinci Dönem Notu: "+ilkDonemNotu);
            System.out.println("İkinci Dönem Notu: "+ikinciDonemNotu);
            //Yılsonu notunu hesaplamak için iki notun ortalaması alınır
            double yilSonuNotu=(ikinciDonemNotu+ilkDonemNotu)/2.0;
            System.out.println("Yıl Sonu Ortalması: "+yilSonuNotu);
            System.out.println("-------------------------------------------------------");
        }
    }

}

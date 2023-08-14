package practiceday_extra;

import java.util.Scanner;

public class Arrays2 {

    /*
    Kullanicidan arrayin boyutunu ve elemenlarini alip arrayi olusturan  ve bize donduren bir method olusturun.
     */
    public static void main(String[] args) {



    }
    public static int[] arrayOlustur() {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen olusturulacak arrayin boyutunu giriniz: ");
            int lenght=scan.nextInt();
            int[] array =new int[lenght];
            for (int i = 0; i <lenght ; i++) {
                System.out.println("Array icin tamsayi olan bir eleman giriniz : ");
                array[i]=scan.nextInt();


            }
           return array;
    }

    }


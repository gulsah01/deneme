package practiceday_extra;
/*
    Kullanicidan arrayin boyutunu ve elemenlarini alip arrayi olusturan  ve bize donduren bir method olusturun.
     */
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(arrayOlustur()));
    }
    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.print(" LÜtfen oluşturulacak array'in boyutunu giriniz: ");
        int length= scan.nextInt();
        int []array=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array için tamsayı olan bir eleman giriniz: ");
            array[i]= scan.nextInt();
        }
        return array;
    }
}


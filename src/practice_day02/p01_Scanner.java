package practice_day02;

import java.util.Scanner;

public class p01_Scanner {
    public static void main(String[] args) {
           /*
1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
 *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lufen sagidaki bilgileri giriniz!");
        System.out.print("Adiniz :");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("Soyadiniz :");
        String surname = scan.nextLine();
        System.out.println();
        System.out.print("Yasiniz :");
        int age = scan.nextInt();
        System.out.println();
        System.out.print("Mail Adresiniz :");
        String mail = scan.next();
        System.out.println();
        System.out.print("Sifreniz :");
        String pass = scan.next();
        System.out.println();
        System.out.println("*****       KAYIT BAŞARILI      *****");
        System.out.println("Adiniz: " + name);
        System.out.println("Soyadiniz: " + surname);
        System.out.println("Yasiniz: " + age);
        System.out.println("Mail adresiniz :"+ mail);
        System.out.println("sifreniz: "+ pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");






    }
}

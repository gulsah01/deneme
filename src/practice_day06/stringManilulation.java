package practice_day06;

import java.util.Scanner;

public class stringManilulation {
    public static void main(String[] args) {
/*
Kullanicidan bir cumle alin
    - cumlede ev geciyorsa, "home home sweet home" yazdirin
    - cumlede is geciyorsa, "calismak guzeldir"
    - ikisini de iceriyorsa "Hem ev lazim hem is"
    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle=scan.nextLine();
        String kucukcumle=cumle.toLowerCase();

        if (kucukcumle.contains("ev")&&kucukcumle.contains("is")){
            System.out.println("Hem ev hem is lazim");
        } else if (kucukcumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (kucukcumle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("Cok calisman lazim");
        }
    }
}

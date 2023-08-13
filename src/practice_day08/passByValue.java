package practice_day08;
// Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.
public class passByValue {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Merhaba");// baslangic metnini olusturuduk
        System.out.println("Ilk metin :"+text);
        modify(text);
        System.out.println("Son metin :"+text);

    }

    public static void modify(StringBuilder str) {
        str.append(" Java");
        System.out.println("Method Icinde: "+str);

    }
}
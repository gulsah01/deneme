package practice_day08;
// Soru: Immutable bir sınıf nasıl oluşturulur? Bir sınıfın değişmez (immutable) olması için
// nasıl adımlar atılır?
public class ImmutableClass {
    public final class ImmutablesExamples{
        public final String message; // final kelimesi ile degismezlik ozelligini tanimliyor


        public ImmutablesExamples(String message) {// method ile deger atiyoruz
            this.message = message;

        }
    public  String getMessage(){// get mothodu ie atanan degere ulasiyoruz
            return message;
    }
    }
}

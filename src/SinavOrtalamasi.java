import java.util.Scanner;

public class SinavOrtalamasi {
    public static void main(String[] args) {

        // Scanner nesnesi oluşturma
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sınav puanlarını isteme
        System.out.print("Matematik sınav puanı: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik sınav puanı: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya sınav puanı: ");
        double kimya = input.nextDouble();

        System.out.print("Türkçe sınav puanı: ");
        double turkce = input.nextDouble();

        System.out.print("Tarih sınav puanı: ");
        double tarih = input.nextDouble();

        System.out.print("Müzik sınav puanı: ");
        double muzik = input.nextDouble();

        // Ortalama hesaplama
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        // Sınıfı geçti veya kaldı mesajının belirlenmesi
        String sinifDurumu = (ortalama >= 60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        // Sonucu ekrana yazdırma
        System.out.println("Ortalama: " + ortalama);
        System.out.println(sinifDurumu);
    }
}
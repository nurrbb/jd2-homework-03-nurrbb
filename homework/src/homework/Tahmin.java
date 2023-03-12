package homework;
import java.util.Scanner;
import java.util.Random;

public class Tahmin {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int dogruTahminSayisi = 0;
        int tahminSayisi = 0;

        while (true) {

            int rastgeleSayi = random.nextInt(100) + 1;
            int tahmin = -1;

            System.out.println("1 ile 100 arasında bir sayı tuttum. Lütfen tahmininizi girin.");

            while (tahmin != rastgeleSayi) {
                tahmin = scanner.nextInt();
                tahminSayisi++;

                if (tahmin < rastgeleSayi) {
                    System.out.println("Çok düşük, tekrar deneyin.");
                } else if (tahmin > rastgeleSayi) {
                    System.out.println("Çok yüksek, tekrar deneyin.");
                } else {
                    System.out.println("Doğru tahmin, tebrikler!");
                    dogruTahminSayisi++;
                    break;
                }
            }

            System.out.println("Toplam doğru tahmin sayısı: " + dogruTahminSayisi);
            System.out.println("Toplam tahmin sayısı: " + tahminSayisi);
            
        }
}

}

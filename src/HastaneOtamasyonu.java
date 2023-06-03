
// Ana sınıf: HastaneOtomasyonu

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HastaneOtomasyonu {
    public static void main(String[] args) {
        List<HastaneBileseni> hastaneBilesenleri = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("Hastane Otomasyonu");
            System.out.println("1. Hasta Ekle");
            System.out.println("2. Doktor Ekle");
            System.out.println("3. Randevu Ekle");
            System.out.println("4. Bilgileri Yazdır");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Hasta Adı: ");
                    String hastaAd = scanner.next();
                    System.out.print("Hasta Soyadı: ");
                    String hastaSoyad = scanner.next();
                    System.out.print("Poliklinik: ");
                    String poliklinik = scanner.next();

                    Hasta hasta = new Hasta(hastaAd, hastaSoyad, poliklinik);
                    hastaneBilesenleri.add(hasta);
                    System.out.println("Hasta başarıyla eklendi.\n");
                    break;

                case 2:
                    System.out.print("Doktor Adı: ");
                    String doktorAd = scanner.next();
                    System.out.print("Doktor Soyadı: ");
                    String doktorSoyad = scanner.next();
                    System.out.print("Bölüm: ");
                    String bolum = scanner.next();

                    Doktor doktor = new Doktor(doktorAd, doktorSoyad, bolum);
                    hastaneBilesenleri.add(doktor);
                    System.out.println("Doktor başarıyla eklendi.\n");
                    break;

                case 3:
                    System.out.print("Randevu Adı: ");
                    String randevuAd = scanner.next();
                    System.out.print("Randevu Soyadı: ");
                    String randevuSoyad = scanner.next();
                    System.out.print("Tarih: ");
                    String tarih = scanner.next();
                    System.out.print("Saat: ");
                    String saat = scanner.next();

                    Randevu randevu = new Randevu(randevuAd, randevuSoyad, tarih, saat);
                    hastaneBilesenleri.add(randevu);
                    System.out.println("Randevu başarıyla eklendi.\n");
                    break;

                case 4:
                    for (HastaneBileseni bilesen : hastaneBilesenleri) {
                        bilesen.bilgileriYazdir();
                    }
                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim!\n");
                    break;
            }
        } while (secim != 0);

        scanner.close();

    }
}

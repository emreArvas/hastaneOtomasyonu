// Randevu sınıfı: HastaneBileseni sınıfından türetilen bir alt sınıf
class Randevu extends HastaneBileseni {
    private String tarih;
    private String saat;

    public Randevu(String ad, String soyad, String tarih, String saat) {
        super(ad, soyad);
        this.tarih = tarih;
        this.saat = saat;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Randevu Bilgileri");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Tarih: " + tarih);
        System.out.println("Saat: " + saat);
        System.out.println();
    }
}

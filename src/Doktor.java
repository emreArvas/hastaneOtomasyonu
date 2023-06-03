// Doktor sınıfı: HastaneBileseni sınıfından türetilen bir alt sınıf
class Doktor extends HastaneBileseni {
    private String bolum;

    public Doktor(String ad, String soyad, String bolum) {
        super(ad, soyad);
        this.bolum = bolum;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Doktor Bilgileri");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Bölüm: " + bolum);
        System.out.println();
    }
}
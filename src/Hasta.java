// Hasta sınıfı: HastaneBileseni sınıfından türetilen bir alt sınıf
class Hasta extends HastaneBileseni {
    private String poliklinik;

    public Hasta(String ad, String soyad, String poliklinik) {
        super(ad, soyad);
        this.poliklinik = poliklinik;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("Hasta Bilgileri");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Poliklinik: " + poliklinik);
        System.out.println();
    }
}
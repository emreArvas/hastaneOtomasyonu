
// Abstract sınıf: HastaneBileseni
abstract class HastaneBileseni {
    protected String ad;
    protected String soyad;

    public HastaneBileseni(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    // Abstract metot: bilgileriYazdir
    public abstract void bilgileriYazdir();
}

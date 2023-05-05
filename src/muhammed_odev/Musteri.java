package muhammed_odev;
import java.util.ArrayList;

class Musteri extends Kisi {
    private int musteriNumarasi;
    private ArrayList<BankaHesap> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;

    public Musteri(long l, int musteriNumarasi, String ad, String soyad, String email, String string) {
        super(ad, soyad, email, string);
        this.musteriNumarasi = musteriNumarasi;
        this.hesaplar = new ArrayList<BankaHesap>();
        this.krediKartlari = new ArrayList<KrediKarti>();
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
    
    public ArrayList<BankaHesap> getHesaplar() {
        return hesaplar;
    }
    
    public void setHesaplar(ArrayList<BankaHesap> hesaplar) {
        this.hesaplar = hesaplar;
    }
    
    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }
    
    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    
    public void hesapEkle(BankaHesap yeniHesap) {
        hesaplar.add(yeniHesap);
    }
    
    public void hesapSil(BankaHesap hesap) {
        hesaplar.remove(hesap);
    }
    
    public void krediKartiEkle(KrediKarti kart) {
        krediKartlari.add(kart);
    }
    
}
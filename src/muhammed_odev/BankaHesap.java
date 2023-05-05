package muhammed_odev;
import java.util.Date;

public class BankaHesap{
    private long iban;
    private Date hesapAcilisTarih;
    private double toplamBakiye;
    private String hesapBilgisi;
    private double islemMiktari;
    private String hesapTuru;

    public BankaHesap(long iban, double toplamBakiye, String hesapBilgisi) {
        this.iban = iban;
        this.toplamBakiye = toplamBakiye;
        this.hesapBilgisi = hesapBilgisi;
        this.hesapAcilisTarih = new Date();
    }

    public BankaHesap(int hesapNumarasi, double bakiye, double faizOrani, Musteri musteri) {
    }

    public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, long iban, double toplamBakiye, String hesapBilgisi) {
        System.out.println("Müşteri Numarası: " + musteriNumarasi);
        System.out.println("Adı Soyadı: " + ad + " " + soyad);
        System.out.println("IBAN: " + iban);
        System.out.println("Toplam Bakiye: " + toplamBakiye);
        System.out.println("Hesap Bilgisi: " + hesapBilgisi);
    }

    @Override
    public String toString() {
        return "BankaHesap{" +
                "iban=" + iban +
                ", hesapAcilisTarih=" + hesapAcilisTarih +
                ", toplamBakiye=" + toplamBakiye +
                ", hesapBilgisi='" + hesapBilgisi + '\'' +
                ", islemMiktari=" + islemMiktari +
                ", hesapTuru='" + hesapTuru + '\'' +
                '}';
    }
}

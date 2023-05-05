package muhammed_odev;
// KrediKarti sınıfı, kartNumarasi, limit, borc ve sahip bilgilerini tutar
public class KrediKarti {
    private int kartNumarasi;
    private double limit;
    private double borc;
    private Musteri musteri;

    public KrediKarti(int kartNumarasi, double limit, Musteri musteri) {
        this.kartNumarasi = kartNumarasi;
        this.limit = limit;
        this.borc = 0;
        this.musteri = musteri;
        musteri.krediKartiEkle(this);
    }

    public int getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBorc() {
        return borc;
    }

    // Kredi kartının borcunu değiştiren setBorc metodu
    public void setBorc(double borc) {
        this.borc = borc;
    }
    
    // Kredi kartına ödeme yapan metot
    public void odemeYap(double miktar) {
        // Kredi kartının borcu ödenen miktar kadar azaltılır
        this.borc -= miktar;
        // Eğer borç negatif hale gelirse sıfırlanır
        if (this.borc < 0) {
            this.borc = 0;
        }else{
            System.out.println("Hata: Ödenen miktar borçtan fazla olamaz.");
        }
    }
    
    // Kredi kartının sahibini döndüren getMusteri metodu
    public Musteri getMusteri() {
    return musteri;
    }
    
    // Kredi kartının sahibini değiştiren setMusteri metodu
    public void setMusteri(Musteri musteri) {
    this.musteri = musteri;
    }
    
    // Kredi kartının bilgilerini döndüren toString metodu
    @Override
    public String toString() {
        return "KrediKarti{" +
            "kartNumarasi=" + kartNumarasi +
            ", limit=" + limit +
            ", borc=" + borc +
            ", musteri=" + musteri.getAd() + " " + musteri.getSoyad() +
            '}';
    }
}
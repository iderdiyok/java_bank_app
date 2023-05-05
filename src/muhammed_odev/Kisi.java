package muhammed_odev;
// Kisi sınıfı, ad, soyad, email ve telefonNumarasi gibi kişisel bilgileri tutar
public class Kisi {
    private int tcKimlikNo;
    private String ad;
    private String soyad;
    private String email;
    private int telefonNumarasi;

    public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "tcKimlikNo=" + tcKimlikNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", telefonNumarasi='" + telefonNumarasi + '\'' +
                '}';
    }
}

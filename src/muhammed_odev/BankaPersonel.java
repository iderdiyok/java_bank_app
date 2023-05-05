package muhammed_odev;
import java.util.ArrayList;

class BankaPersonel extends Kisi {
    private int personelID;
    private ArrayList<Musteri> musteriler;

    public BankaPersonel(int tcKimlikNo, String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.personelID = tcKimlikNo;
        this.musteriler = new ArrayList<Musteri>();
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public void musteriSil(Musteri musteri) {
        musteriler.remove(musteri);
    }

    public String toString() {
        return "Banka Personeli: " + super.getAd() + " " + super.getSoyad();
    }
}
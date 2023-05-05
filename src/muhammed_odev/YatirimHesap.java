package muhammed_odev;
public class YatirimHesap extends BankaHesap {
    private double yatirimBakiyesi;
    private int vadeSuresi;

    public YatirimHesap(int iban, double toplamBakiye, String hesapBilgisi, double yatirimBakiyesi, int vadeSuresi) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.yatirimBakiyesi = yatirimBakiyesi;
        this.vadeSuresi = vadeSuresi;
    }

    public double getYatirimBakiyesi() {
        return yatirimBakiyesi;
    }

    public void setYatirimBakiyesi(double yatirimBakiyesi) {
        this.yatirimBakiyesi = yatirimBakiyesi;
    }

    public int getVadeSuresi() {
        return vadeSuresi;
    }

    public void setVadeSuresi(int vadeSuresi) {
        this.vadeSuresi = vadeSuresi;
    }

    @Override
    public String toString() {
        return "YatirimHesap [yatirimBakiyesi=" + yatirimBakiyesi + ", vadeSuresi=" + vadeSuresi + ", toString()="
                + super.toString() + "]";
    }
}

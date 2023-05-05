package muhammed_odev;
public class VadesizHesap extends BankaHesap {
    private double faizOrani;

    public VadesizHesap(int iban, double toplamBakiye, String hesapBilgisi, double faizOrani) {
        super(iban, toplamBakiye, hesapBilgisi);
        this.faizOrani = faizOrani;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }

    @Override
    public String toString() {
        return "VadesizHesap [faizOrani=" + faizOrani + ", toString()=" + super.toString() + "]";
    }
}

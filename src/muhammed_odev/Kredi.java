package muhammed_odev;
// Kredi sınıfı, krediye ilişkin bilgileri tutar
public class Kredi {
    private String tur;
    private double miktar;
    private double faizOrani;
    private int vade;

    public Kredi(String tur, double miktar, double faizOrani, int vade) {
        this.tur = tur;
        this.miktar = miktar;
        this.faizOrani = faizOrani;
        this.vade = vade;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }

    public int getVade() {
        return vade;
    }

    public void setVade(int vade) {
        this.vade = vade;
    }
}

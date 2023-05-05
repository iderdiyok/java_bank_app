package muhammed_odev;
public class VadeliHesap extends BankaHesap {
    private int vadeGunu;

    public VadeliHesap(int hesapNumarasi, double bakiye, double faizOrani, int vadeGunu, Musteri musteri) {
        super(hesapNumarasi, bakiye, faizOrani, musteri);
        this.vadeGunu = vadeGunu;
    }

    public int getVadeGunu() {
        return vadeGunu;
    }

    public void setVadeGunu(int vadeGunu) {
        this.vadeGunu = vadeGunu;
    }
}

package muhammed_odev;

public class Main {
    public static void main(String[] args) {
    
        // Müşteri oluşturulur ve bankaya eklenir
        Musteri musteri1 = new Musteri(12345678901L, 1, "Ali", "Yılmaz", "ali@gmail.com", "5551234567");
        
        // Kredi kartı oluşturulur ve müşteriye eklenir
        KrediKarti krediKarti1 = new KrediKarti(1, 5000, musteri1);
        musteri1.krediKartiEkle(krediKarti1);
    
        // Müşteri bilgileri ekrana yazdırılır
        System.out.println(musteri1);

    
        // Kredi kartı bilgileri ekrana yazdırılır
        System.out.println(krediKarti1);
    
        // Kredi oluşturulur ve bankaya eklenir
        Kredi kredi1 = new Kredi(null, 1, 1, 5000);
    
        // Kredi bilgileri ekrana yazdırılır
        System.out.println(kredi1);
    }
    
}

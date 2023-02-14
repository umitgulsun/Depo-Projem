package depo;

public class Urun
{
    Urun urun;
    public String urunAdi;
    public String urunId="";

    public String urunBirimi;
    public String urunUretici;
    public String urunMiktari;
    public String urunCinsi="";

    public Urun(String urunAdi, String urunBirimi, String urunMiktari, String urunCinsi, String urunUretici)
    {
        this.urunAdi = urunAdi;
        this.urunBirimi = urunBirimi;
        this.urunCinsi=urunCinsi;
        this.urunUretici=urunUretici;
        this.urunMiktari =urunMiktari ;
    }



}

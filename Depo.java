package depo;


import java.util.*;

public class Depo
{
    String name="İplik Fabrikası";
    static Map<String, String> depoListesi = new HashMap<>();
    public static int urunIdNosu=0;
    Scanner scan=new Scanner(System.in);
    Raf raf=new Raf();

    public void urunEkle()
    {
        System.out.println("Lütfen ürün adı giriniz...");
        String str = scan.next();
        System.out.println("Lütfen ürün birimi giriniz...");
        String str1 = scan.next();
        System.out.println("Lütfen ürün Miktarı giriniz...");
        String miktar = scan.next();
        System.out.println("Lütfen ürün cinsi giriniz...");
        String str2 = scan.next();
        System.out.println("Lütfen ürün üreticisi giriniz...");
        String str3 = scan.next();
        Urun urun = new Urun(str, str1, miktar, str2, str3);
        String rafyerim= raf.rafOlustur(urun);
        String urunIdNo= urunIdOlustur(urun);
        String values = str + ", " + str1+", "+miktar+", "+str2+", "+str3+", "+rafyerim;
        depoListesi.put(urunIdNo, values);
    }
    public String urunIdOlustur(Urun urun){
        String id="";
         id+=urun.urunAdi.substring(0,2)+urun.urunCinsi+(++urunIdNosu);

        return id;
    }


    public void depoListeGoster()
    {
        System.out.println("urunıd        urunAdı   urunBirimi  Miktar    Cinsi     Üreticisi    Raf");
        System.out.println("-----------------------------------------------------------");

        for (Map.Entry<String, String> w : depoListesi.entrySet())
        {
            String key = w.getKey();
            String[] valueDizi = w.getValue().split(", ");
            System.out.printf("%-13s %-9s %-11s %-9s %-9s %-12s %3s", key, valueDizi[0], valueDizi[1], valueDizi[2], valueDizi[3], valueDizi[4],valueDizi[5]);
            System.out.println();
        }
    }

    public void urunCikar()
    {
        System.out.println("Çıkeracağınız ürünün 'urunId' numarasını girin");
        String str= scan.next();
        if (depoListesi.containsKey(str))
        {
            depoListesi.remove(str);
        }else System.out.println("Hatalı giriş...");
    }
    public void urunAra()
    {
        System.out.println("Lütefen aradığınız ürünün 'urunId' numarasını girin");
        String str= scan.next();
        System.out.println("urunıd        urunAdı   urunBirimi  Miktar    Cinsi     Üreticisi    Raf");
        System.out.println("-----------------------------------------------------------");

        for (Map.Entry<String, String> w: depoListesi.entrySet())
        {

            String key=w.getKey();

            String[] valueDizi = w.getValue().split(", ");
            if (key.equalsIgnoreCase(str))
            {
                System.out.printf("%-13s %-9s %-11s %-9s %-9s %-12s %3s", key, valueDizi[0], valueDizi[1], valueDizi[2], valueDizi[3], valueDizi[4],valueDizi[5]);
                System.out.println();

            }

        }
    }
    public void ayniUrunOzellikleriGetir()
    {
        System.out.println("Lütfen aradığınız ürünlerin 'özelliğini' giriniz");
        String str= scan.next();
        System.out.println("urunıd        urunAdı   urunBirimi  Miktar    Cinsi     Üreticisi    Raf");
        System.out.println("-----------------------------------------------------------");

        for (Map.Entry<String, String> w: depoListesi.entrySet())
        {
            String key=w.getKey();
            String[] valueDizi = w.getValue().split(", ");


            for (int i = 0; i < valueDizi.length; i++)
            {
                if (str.equalsIgnoreCase(valueDizi[i]))
                {

                    System.out.printf("%-13s %-9s %-11s %-9s %-9s %-12s %3s", key, valueDizi[0], valueDizi[1], valueDizi[2], valueDizi[3], valueDizi[4],valueDizi[5]);
                    System.out.println();

                }
            }

        }
    }

}

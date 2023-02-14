package depo;

import java.util.Scanner;

public class DepoRunner
{
    public static void main(String[] args)
    {

        boolean istrue = true;
        Scanner scan = new Scanner(System.in);
        String islem = "";
        Depo depo =new Depo();
        Raf raf = new Raf();

        while (istrue)
        {

            System.out.println("Lütfen Yapmak istediğiniz işlemi giriniz\n1-Urun Ekleyiniz" +
                    "\n2-Ürün Çıkarınız\n3-Ürünıd numarasına göre ara\n4-Sorguladığımız urun ile aynı özellikteki elemanları getirme \n5-Çıkış yapınız");
            islem = scan.next();

            switch (islem)
            {
                case "1":
                    depo.urunEkle();
                    depo.depoListeGoster();
                    break;
                case "2":
                    depo.urunCikar();
                    depo.depoListeGoster();
                    break;
                case "3":
                    depo.urunAra();
                    break;
                case "4":
                    depo.ayniUrunOzellikleriGetir();
                    break;
                case "5":
                    System.out.println("çıkış yaptınız...");
                    istrue = false;
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız.....");
                    break;

            } System.out.println();
        }

    }


}

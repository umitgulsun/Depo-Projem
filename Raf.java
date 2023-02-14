package depo;

import java.util.ArrayList;
import java.util.List;

public class Raf
{

    Urun urun;
    public String rafAdi="";
    public List<String> rafCinsi=new ArrayList<>();
    public String rafOlustur(Urun urun)
    {

        if (urun.urunCinsi.equalsIgnoreCase("Pamuk"))
        {
            rafAdi="RafPamuk";
            return rafAdi;
        }else if (urun.urunCinsi.equalsIgnoreCase("Naylon"))
        {
            rafAdi="RafNaylon";
            return rafAdi;
        }else if (urun.urunCinsi.equalsIgnoreCase("Polyester"))
        {
            rafAdi="RafPolyester";
            return rafAdi;
        }

        return null;
    }

}

import java.util.ArrayList;
import java.util.HashMap;

public class Magazyn {
    private HashMap<Produkt, Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkty.containsKey(produkt)) {
            produkty.put(produkt, produkty.get(produkt) + ilosc);
        }
        else{
            produkty.put(produkt, ilosc);
        }
        produkt.dodajDoMagazynu(ilosc);
    }
/*
    public void wyswietl_asortyment(){
        for(Produkt produkt : produkty){
            System.out.println("Nazwa produktu: "+produkt.getNazwa()+" Cena produktu: "+produkt.getCena()+" Ilosc na magazynie: "+produkt.getIloscNaMagazynie());
        }
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if(produkty == null || produkty.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.produkty = produkty;
        }
    }

    public ArrayList<Integer> getIlosc() {
        return ilosc;
    }

    public void setIlosc(ArrayList<Integer> ilosc) {
        if(ilosc == null || ilosc.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.ilosc = ilosc;
        }
    }

 */
}

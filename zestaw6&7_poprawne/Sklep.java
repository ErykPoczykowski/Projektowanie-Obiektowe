import java.util.ArrayList;
import java.util.Date;

public class Sklep {
    private ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private String dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(String nazwaSklepu, String dataPowstania, Magazyn magazynSklepu) {
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void wyswietlOferty(){
        for(Produkt produkt : produkty){
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProduktu(String nazwa){
        for(Produkt produkt : produkty){
            if(produkt.getNazwa().equals(nazwa)) return produkt;
        }
        return null;
    }

    public void zakupy(String nazwa, int ilosc, KoszykZakupowy koszyk){
        Produkt produkt = wyszukajProduktu(nazwa);
        if(produkt != null){
            if(produkt.getIloscNaMagazynie() >= ilosc){
                koszyk.dodajProdukt(produkt, ilosc);
                produkt.usunZMagazynu(ilosc);
            }
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

    public String getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(String dataPowstania) {
        if(dataPowstania == null || dataPowstania.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.dataPowstania = dataPowstania;
        }
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu == null || nazwaSklepu.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.nazwaSklepu = nazwaSklepu;
        }
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if(magazynSklepu == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.magazynSklepu = magazynSklepu;
        }
    }
}

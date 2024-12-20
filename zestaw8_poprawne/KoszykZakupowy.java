import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Produkt> produkty;
    private ArrayList<Integer> ilosc;

    public KoszykZakupowy() {
        this.produkty = new ArrayList<>();
        this.ilosc = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.getIloscNaMagazynie() >= ilosc){
            produkty.add(produkt);
            this.ilosc.add(ilosc);
            produkt.usunZMagazynu(ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka(){
        int i = 0;
        for (Produkt produkt : produkty) {
            System.out.println("Nazwa: "+produkt.getNazwa()+" Cena: "+produkt.getCena()+" Ilość w koszyku: "+ ilosc.get(i));
            i++;
        }
    }

    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for (int i = 0; i < produkty.size(); i++) {
            Produkt produkt = produkty.get(i);
            int ilosc = this.ilosc.get(i);
            suma += produkt.getCena() * ilosc;
        }
        return Math.round(suma * 100.0) / 100.0;
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
}

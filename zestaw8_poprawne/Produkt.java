public class Produkt {

    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public Produkt()
    {

    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa + " Cena: " + cena + " Ilość na magazynie: "+ iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc){
        if(iloscNaMagazynie-ilosc > 0){
            iloscNaMagazynie -= ilosc;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa == null || nazwa.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.nazwa = nazwa;
        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.cena = cena;
        }
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if(iloscNaMagazynie < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.iloscNaMagazynie = iloscNaMagazynie;
        }
    }
}

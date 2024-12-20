public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String status) {
        this.statusZamowienia = status;
    }


    public void wyswietlZamowienie(){
        System.out.println("Status zamówienia: "+statusZamowienia);
        koszykZakupowy.wyswietlZawartoscKoszyka();
    }

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacony")) {
            statusZamowienia = "Gotowe do wysyłki";
        }
    }

    /*
    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
        koszykZakupowy.zwrocProdukt(nazwaProduktu, ilosc);
        platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }
     */

    public KoszykZakupowy getKoszykZakupowy(){
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if(koszykZakupowy == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.koszykZakupowy = koszykZakupowy;
        }
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if(statusZamowienia == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.statusZamowienia = statusZamowienia;
        }
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if(platnosc == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.platnosc = platnosc;
        }
    }
}

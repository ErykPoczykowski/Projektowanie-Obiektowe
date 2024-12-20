import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
        this.adres = adres;
    }
    public Klient()
    {}

    public void dodajZamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien(){
        int i = 1;
        for(Zamowienie z : listaZamowien){
            System.out.println("Zamowienie "+i);
            z.wyswietlZamowienie();
            i++;
        }
    }
    public double obliczLacznyKosztZamowien(){
        double koszt = 0;
        for(Zamowienie z : listaZamowien){
            KoszykZakupowy k = z.getKoszykZakupowy();
            koszt += k.obliczCalkowitaWartosc();
        }
        return koszt;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie == null || imie.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko == null || nazwisko.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.nazwisko = nazwisko;
        }
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if(adres == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.adres = adres;
        }
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if(listaZamowien == null || listaZamowien.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.listaZamowien = listaZamowien;
        }
    }
}

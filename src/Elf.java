public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;
    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public void przedstawSie()
    {
        System.out.println("Cześć, nazywam się "+imie+" mam "+wiek+" lat, a moje stanowisko pracy to "+ stanowisko);

    }
    @Override
    public String toString() {
        return "Elf{" +
                ", imie=" + imie +
                ", wiek='" + wiek + '\'' +
                "stanowisko='" + stanowisko + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Elf that = (Elf) obj;
        return imie.equals(that.imie)&& stanowisko.equals(that.stanowisko);
    }

    public int hashcode()
    {
        return imie.hashCode() + stanowisko.hashCode();
    }

    public String getImie() {
        return imie;
    }
    public int getWiek() {
        return wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setImie(String imie) {
        if(imie!=null && !imie.isEmpty()) {
            this.imie = imie;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
    public void setWiek(int wiek) {
        if(wiek >= 0) {
            this.wiek = wiek;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
    public void setStanowisko(String stanowisko) {
        if(stanowisko!=null && !stanowisko.isEmpty()) {
            this.stanowisko = stanowisko;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
}

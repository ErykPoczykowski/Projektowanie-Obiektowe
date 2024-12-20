public class Renifer {
    private String imie;
    private int predkosc;
    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }
    public void nakarmRenifera()
    {
        this.predkosc = this.predkosc + 5;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                ", imie=" + imie +
                ", predkosc='" + predkosc + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Renifer that = (Renifer) obj;
        return imie.equals(that.imie);
    }
    public int hashcode()
    {
        return imie.hashCode();
    }

    public String getImie() {
        return imie;
    }
    public int getPredkosc() {
        return predkosc;
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
    public void setWiek(int predkosc) {
        if(predkosc >= 0) {
            this.predkosc = predkosc;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
}

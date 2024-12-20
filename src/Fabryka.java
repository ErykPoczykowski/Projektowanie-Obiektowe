import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> Elfy;
    private double dlGeo;
    private double szGeo;
    public Fabryka(ArrayList<Elf> Elfy, double dlGeo, double szGeo) {
        this.Elfy = Elfy;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }
    public void dodajPracownika(Elf elf)
    {
        this.Elfy.add(elf);
    }
    public void usunPracownika(Elf elf)
    {
        if(this.Elfy.contains(elf))
        {
            this.Elfy.remove(elf);
        }
    }
    public void najstarszyPracownik()
    {

    }
    @Override
    public String toString() {
        return "Fabryka{" +
                ", Elfy=" + Elfy +
                ", dlGeo='" + dlGeo + '\'' +
                "szGeo='" + szGeo + '\'' + +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Fabryka that = (Fabryka) obj;
        return Elfy.equals(that.Elfy);
    }
    public int hashcode()
    {
        return Elfy.hashCode();
    }
    public double getDlGeo() {
        return dlGeo;
    }
    public double getSZGeo() {
        return szGeo;
    }
    public ArrayList<Elf> getElfy() {
        return Elfy;
    }
    public void setImie(ArrayList<Elf> Elf) {
        if(Elf!=null && !Elf.isEmpty()) {
            this.Elfy = Elf;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
    public void setDlGeo(double dlGeo) {
        if(dlGeo >= -180&&dlGeo <= 180) {
            this.dlGeo = dlGeo;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
    public void setSzGeo(double szGeo) {
        if(szGeo >= -180&&szGeo <= 180) {
            this.szGeo = szGeo;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }

}

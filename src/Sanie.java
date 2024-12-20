import java.util.ArrayList;

public class Sanie {
    private Renifer[] lista;
    public Sanie(Renifer[] lista) {
        this.lista = lista;
    }
    public void dodajRenifera(Renifer renifer)
    {
        Renifer[] newlist = new Renifer[lista.length+1];
        newlist[lista.length] = renifer;
        this.lista = newlist;
    }
    public void sumaPredkosci()
    {
        int suma = 0;
        for(int i = 0; i < lista.length; i++)
        {

        }

    }
    public void najwolniejszyRenifer()
    {

    }
    @Override
    public String toString() {
        return "Sanie{" +
                ", Renifer=" + lista +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Sanie that = (Sanie) obj;
        return lista.equals(that.lista);
    }
    public int hashcode()
    {
        return lista.hashCode();
    }
    public Renifer[] getRenifer() {
        return lista;
    }
    public void setImie(Renifer[] lista) {
        if(lista!=null) {
            this.lista = lista;
        }
        else
        {
            System.out.println("zła wartość");
        }
    }
}

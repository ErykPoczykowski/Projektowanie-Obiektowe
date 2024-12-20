public class KlientIndywidualny extends Klient {
    public final String PESEL;

    public KlientIndywidualny(String PESEL) {
        this.PESEL = PESEL;
    }
    public String getPESEL()
    {
        return PESEL;
    }
}

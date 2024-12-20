public class KlientFirmowy extends Klient{
    public final String NIP;
    public final String REGON;

    public KlientFirmowy(String NIP, String REGON) {
        this.NIP = NIP;
        this.REGON = REGON;
    }
    public String getNIP()
    {
        return NIP;
    }
    public String getREGON()
    {
        return REGON;
    }
}
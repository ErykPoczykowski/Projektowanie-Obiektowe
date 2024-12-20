public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota) {
        this.statusPlatnosci = "Nieopłacone";
        this.kwota = kwota;
    }

    public void zaplac(double kwota){
        statusPlatnosci = "Opłacone";
        this.kwota = kwota;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if(kwota < 0){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.kwota = kwota;
        }
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if(statusPlatnosci == null || statusPlatnosci.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.statusPlatnosci = statusPlatnosci;
        }
    }
}

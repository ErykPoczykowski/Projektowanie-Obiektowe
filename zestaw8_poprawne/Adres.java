public class Adres {
    private String ulica;
    private String numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private Integer kodPocztowy;

    public Adres(String ulica, String numerDomu, int numerMieszkania, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String numerDomu, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public String toString() {
        return "Adres{" +
                ", kodPocztowy=" + kodPocztowy +
                ", miasto='" + miasto + '\'' +
                "ulica='" + ulica + '\'' +
                ", numerDomu='" + numerDomu + '\'' +
                ", numerMieszkania=" + numerMieszkania +
                '}';
    }

    public void pokaz(){
        System.out.println("Adres:");
        System.out.println(kodPocztowy+" "+miasto);
        System.out.print("ul. "+ulica+" "+numerDomu);
        if(numerMieszkania != 0){
            System.out.println("/"+numerMieszkania);
        }
    }

    public boolean przed(int kodPocztowy1, int kodPocztowy2){
        return kodPocztowy1<kodPocztowy2;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica == null || ulica.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.ulica = ulica;
        }
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if(numerDomu == null || numerDomu.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.numerDomu = numerDomu;
        }
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(Integer numerMieszkania) {
        if(numerMieszkania == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.numerMieszkania = numerMieszkania;
        }
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto == null || miasto.isEmpty()){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.miasto = miasto;
        }
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(Integer kodPocztowy) {
        if(kodPocztowy == null){
            throw new IllegalArgumentException("Niepoprawne dane.");
        }
        else {
            this.kodPocztowy = kodPocztowy;
        }
    }
}

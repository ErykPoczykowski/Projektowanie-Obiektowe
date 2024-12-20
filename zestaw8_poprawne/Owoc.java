public abstract class Owoc {
    public abstract void zjedz();

    public abstract void umyj();

    public abstract String smak();
}
class Jablko extends Owoc{
    @Override
    public String smak(){
        return "słodki";
    }
    @Override
    public void umyj(){
        System.out.println("Myje jabłko");
    }
    @Override
    public void zjedz(){
        System.out.println("Jem jabłko");
    }
}


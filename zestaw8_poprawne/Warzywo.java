public abstract class Warzywo {
    public abstract void zjedz();

    public abstract void umyj();

    public abstract String smak();
}
class Kapusta extends Warzywo{
    @Override
    public String smak(){
        return "słony";
    }
    @Override
    public void umyj(){
        System.out.println("Myje kapustę");
    }
    @Override
    public void zjedz(){
        System.out.println("Jem kapustę");
    }
}


public class Dog extends Animal {
    private String breed;
    private int age;

    public Dog(String name, int age, String breed) {
        super(name);
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
}

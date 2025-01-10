import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T obiekt;

    public void setObiekt(T obiekt){
        this.obiekt = obiekt;
    }

    public T getObiekt(){
        return obiekt;
    }
}

class Counter<T>{
    List<T> lista = new ArrayList<T>();

    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}

public class TestPunkt {

    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static <T> T[] swap(T[] tab, int a, int b){
        if(a < 0 || b < 0 || a > tab.length || b > tab.length){
            throw new IndexOutOfBoundsException();
        }
        T tmp = tab[a];
        tab[a] = tab[b];
        tab[b] = tmp;
        return tab;
    }

    public static <T extends Comparable<T>> T minValue(T[] tab){
        if(tab.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
        T min = tab[0];
        for(T x : tab){
            if(x.compareTo(min) < 0){
                min = x;
            }
        }
        return min;
    }

    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.getID() > element2.getID()){
            return element1;
        }
        else return element2;
    }


    public static Pair<Dog> findMinMaxAge(Dog[] dogs, Pair<Dog> result) {
        Dog min = dogs[0];
        Dog max = dogs[0];
        for (Dog d : dogs) {
            if (d.getAge() < min.getAge()) {
                min = d;
            }
            if (d.getAge() > max.getAge()) {
                max = d;
            }
        }
        result.setFirst(min);
        result.setSecond(max);
        return result;
    }
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();
        b1.setObiekt("1357");
        System.out.println(b1.getObiekt());

        Box<Integer> b2 = new Box<>();
        b2.setObiekt(1357);
        System.out.println(b2.getObiekt());

        Box<Integer> b3 = new Box<>();
        b3.setObiekt(1357);
        System.out.println(b3.getObiekt());

        System.out.println(isEqual(b1.getObiekt(), b2.getObiekt()));
        System.out.println(isEqual(b2.getObiekt(), b3.getObiekt()));

        System.out.println("Zadanie 21: ");
        Dog[] dogs = new Dog[3];
        Dog dog1 = new Dog("Kumpel", 1, 8, "beagle");
        Dog dog2 = new Dog("Milton", 2, 4, "beagle");
        Dog dog3 = new Dog("Hodor", 3, 5, "Mieszaniec");
        Dog result = findMax(dog1, dog2);
        System.out.println(result);

        System.out.println("Zadanie 28: ");
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        Pair<Dog> result2 = new Pair<>();
        result2 = findMinMaxAge(dogs, result2);
        System.out.println(result2.getFirst());
        System.out.println(result2.getSecond());

    }
}
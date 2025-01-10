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
/*
    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.getAge() > element2.getAge()){
            return element1;
        }
        else return element2;
    }

 */

    public static Pair<Dog> findMinMaxAge(Dog[] dogs, Pair<Dog> result){
        Dog min = dogs[0];
        Dog max = dogs[0];
        for(Dog d : dogs){
            if(d.getAge() < min.getAge()){
                min = d;
            }
            if(d.getAge() > max.getAge()){
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

        System.out.println("Zadanie 12:");
        Integer[] tab = new Integer[5];
        tab[0] = 5;
        tab[1] = 3;
        tab[2] = 0;
        tab[3] = 6;
        tab[4] = 2;
        for(Integer x : tab){
            System.out.println(x);
        }
        System.out.println("Swap 0 1");
        swap(tab, 0, 1);
        for(Integer x : tab){
            System.out.println(x);
        }

        System.out.println("Zadanie 14: ");
        Integer[] tab2 = new Integer[3];
        tab2[0] = 5;
        tab2[1] = 2;
        tab2[2] = 3;
        System.out.println(minValue(tab2));
        Double[] tab3 = new Double[3];
        tab3[0] = 1.2;
        tab3[1] = -2.9;
        tab3[2] = 7.4;
        System.out.println(minValue(tab3));
        String[] tab4 = new String[3];
        tab4[0] = "kosz";
        tab4[1] = "jabłonka";
        tab4[2] = "słowo";
        System.out.println(minValue(tab4));
        Person[] osoby = new Person[3];
        Person osoba1 = new Person("Paweł", 25);
        Person osoba2 = new Person("Katarzyna", 21);
        Person osoba3 = new Person("Damian", 19);
        osoby[0] = osoba1;
        osoby[1] = osoba2;
        osoby[2] = osoba3;
        //System.out.println(minValue(osoby));

        System.out.println("Zadanie 28: ");
        Dog[] dogs = new Dog[3];
        Dog dog1 = new Dog("Lulek", 5, "Mieszaniec");
        Dog dog2 = new Dog("Kulek", 10, "Mieszaniec");
        Dog dog3 = new Dog("Julek", 2, "Mieszaniec");
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        Pair<Dog> result = new Pair<>();
        result = findMinMaxAge(dogs, result);
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
    }
}

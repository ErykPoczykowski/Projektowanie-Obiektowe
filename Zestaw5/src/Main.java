import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(123);
        tab1.add(5133);
        tab1.add(783);
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(1);
        tab2.add(6);
        tab2.add(9);
        System.out.print(tab1);
        System.out.print(tab2);
        // zad 1
        //System.out.print(append(tab1,tab2));
        // zad 2
        //System.out.print(merge(tab1,tab2));
        // zad 3
        //System.out.print(mergeSort(tab1,tab2));
        // zad 4
        //int liczba = 123123;
        //System.out.print(toArraylist(liczba));
        //String napis = "ala ma kota";
        //System.out.print(toArraylist(napis));
        // zad 5
        //String napis = "ala ma kota";
        //System.out.print(checkChar(toArraylist(napis), "a"));
        // zad 6
        //String napis = "ala ma kota";
        //System.out.print(countChar(toArraylist(napis), "m"));
        // zad 7
        


    }
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        tab1.addAll(tab2);
        ArrayList<Integer> wynik = tab1;
        return wynik;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> wynik = new ArrayList<>();
        for(int i = 0;i < tab1.size()+tab2.size(); i++)
        {
            if(i%2==0)
            {
                wynik.add(i, tab1.get(i/2));
            }
            else if(i%2==1)
            {
                wynik.add(i, tab2.get(i/2));
            }
        }
        return wynik;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        tab1.addAll(tab2);
        Collections.sort(tab1);
        ArrayList<Integer> wynik = tab1;
        return wynik;
    }
    public static ArrayList<String> toArraylist(String napis)
    {
        ArrayList<String> wynik = new ArrayList<>();
        String[] tab = napis.split("");
        for(int i = 0;i<tab.length;i++)
        {
            wynik.add(i,tab[i]);
        }
        Collections.sort(wynik);
        return wynik;
    }
    public static boolean checkChar(ArrayList<String> tab, String znak)
    {
        for(int i = 0;i<tab.size();i++)
        {
            if(tab.get(i).equals(znak))
            {
                return true;
            }
        }
        return false;
    }
    public static int countChar(ArrayList<String> tab, String znak)
    {
        int count = 0;
        for(int i = 0;i<tab.size();i++)
        {
            if(tab.get(i).equals(znak))
            {
                count++;
            }
        }
        return count;
    }

}
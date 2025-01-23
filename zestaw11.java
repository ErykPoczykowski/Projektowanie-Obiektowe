import java.util.*;

public class Main {

    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);

        for(T item: uniqueElements){
            System.out.println(item);
        }
    }

    public <T> ArrayList<T> mergeLists(ArrayList<T> first, ArrayList<T> second){
        ArrayList<T> merged = new ArrayList<>();

        merged.addAll(first);
        merged.addAll(second);

        return merged;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list){
        return list == list.reversed();
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list){
        HashSet<T> elements = new HashSet<>();
        LinkedHashSet<T> uniqueElements = new LinkedHashSet<>();
        for(T item: list){
            if(!uniqueElements.add(item)){
                elements.add(item);
            }
        }
        uniqueElements.removeAll(elements);
        return new HashSet<>(uniqueElements);
    }

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> treeSet, T lowerBound, T upperBound){
        return (TreeSet<T>) treeSet.subSet(lowerBound, true, upperBound, true);
    }

    public static <V, K> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map){
        HashMap<V, Integer> occurrences = new HashMap<>();
        for(Map.Entry<K, V> entry: map.entrySet()){
            if(occurrences.containsKey(entry.getValue())){
                occurrences.put(entry.getValue(), occurrences.get(entry.getValue()) + 1);
            }
            else{
                occurrences.put(entry.getValue(), 1);
            }
        }
        return occurrences;
    }

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey){
        return (TreeMap<K, V>) map.subMap(startKey, true, endKey, true);
    }

    public static void main(String[] args) {
        /*
        System.out.println("Collection: ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        printUnique(list);

        System.out.println("LinkedList: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(1);
        System.out.println(isPalindrome(linkedList));

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("b");
        stringList.add("a");
        System.out.println(isPalindrome(stringList));
        */
        System.out.println("HashSet: ");
        List<Integer> lista = List.of(1, 2, 2, 3, 3, 3);

        HashSet<Integer> hashSet = findUniqueElements(lista);
        for(Integer element: hashSet){
            System.out.println(element);
        }

        System.out.println("TreeSet: ");
        System.out.println("Integer: ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);

        TreeSet<Integer> treeSet2 = findElementsInRange(treeSet, 2, 5);
        for(Integer item: treeSet2){
            System.out.println(item);
        }

        System.out.println("String: ");
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("d");
        stringSet.add("e");
        stringSet.add("f");
        stringSet.add("g");

        TreeSet<String> stringSet2 = findElementsInRange(stringSet, "c", "e");
        for(String item: stringSet2){
            System.out.println(item);
        }

        System.out.println("HashMap: ");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "a");
        map.put(5, "a");
        map.put(6, "b");

        HashMap<String, Integer> hashMap = countValueOccurrences(map);
        for(String item: hashMap.keySet()){
            System.out.println(item+": "+hashMap.get(item));
        }
        /*
        System.out.println("TreeMap: ");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(3, "c");
        treeMap.put(4, "d");
        treeMap.put(5, "e");
        treeMap.put(6, "f");
        treeMap.put(7, "g");
        treeMap.put(8, "h");

        TreeMap<Integer, String> result = subMapInRange(treeMap, 2, 5);
        for(Integer item: result.keySet()){
            System.out.println(item+": "+result.get(item));
        }

         */
    }
}
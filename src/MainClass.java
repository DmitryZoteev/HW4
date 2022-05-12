import java.time.Duration;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Иван", "Иванов", 20),
                new Person("Петр", "Петров", 21),
                new Person("Семен", "Семенов", 22),
                new Person("Олег", "Олегов", 23),
                new Person("Арсений", "Арсеньев", 24),
                new Person("Екатерина", "Иванова", 20),
                new Person("Виктория", "Петрова", 21),
                new Person("Ангелина", "Семенова", 22),
                new Person("Наталья", "Олегова", 23),
                new Person("Ксения", "Арсеньева", 24),
                new Person("Иван2", "Иванов2", 20),
                new Person("Петр2", "Петров2", 21),
                new Person("Семен2", "Семенов2", 22),
                new Person("Олег2", "Олегов2", 23),
                new Person("Арсений2", "Арсеньев2", 24),
                new Person("Екатерина2", "Иванова2", 20),
                new Person("Виктория2", "Петрова2", 21),
                new Person("Ангелина2", "Семенова2", 22),
                new Person("Наталья2", "Олегова2", 23),
                new Person("Ксения2", "Арсеньева2", 24),
                new Person("Иван3", "Иванов3", 20),
                new Person("Петр3", "Петров3", 21),
                new Person("Семен3", "Семенов3", 22),
                new Person("Олег3", "Олегов3", 23),
                new Person("Арсений3", "Арсеньев3", 24),
                new Person("Екатерина3", "Иванова3", 20),
                new Person("Виктория3", "Петрова3", 21),
                new Person("Ангелина3", "Семенова3", 22),
                new Person("Наталья3", "Олегова3", 23),
                new Person("Ксения3", "Арсеньева3", 24),
                new Person("Иван4", "Иванов4", 20),
                new Person("Петр4", "Петров4", 21),
                new Person("Семен4", "Семенов4", 22),
                new Person("Олег4", "Олегов4", 23),
                new Person("Арсений4", "Арсеньев4", 24),
                new Person("Екатерина4", "Иванова4", 20),
                new Person("Виктория4", "Петрова4", 21),
                new Person("Ангелина4", "Семенова4", 22),
                new Person("Наталья4", "Олегова4", 23),
                new Person("Ксения4", "Арсеньева4", 24),
                new Person("Иван5", "Иванов5", 20),
                new Person("Петр5", "Петров5", 21),
                new Person("Семен5", "Семенов5", 22),
                new Person("Олег5", "Олегов5", 23),
                new Person("Арсений5", "Арсеньев5", 24),
                new Person("Екатерина5", "Иванова5", 20),
                new Person("Виктория5", "Петрова5", 21),
                new Person("Ангелина5", "Семенова5", 22),
                new Person("Наталья5", "Олегова5", 23),
                new Person("Ксения5", "Арсеньева5", 24),
                new Person("Иван6", "Иванов6", 20),
                new Person("Петр6", "Петров6", 21),
                new Person("Семен6", "Семенов6", 22),
                new Person("Олег6", "Олегов6", 23),
                new Person("Арсений6", "Арсеньев6", 24),
                new Person("Екатерина6", "Иванова6", 20),
                new Person("Виктория6", "Петрова6", 21),
                new Person("Ангелина6", "Семенова6", 22),
                new Person("Наталья6", "Олегова6", 23),
                new Person("Ксения6", "Арсеньева6", 24),
                new Person("Иван62", "Иванов62", 20),
                new Person("Петр62", "Петров62", 21),
                new Person("Семен62", "Семенов62", 22),
                new Person("Олег62", "Олегов62", 23),
                new Person("Арсений62", "Арсеньев62", 24),
                new Person("Екатерина62", "Иванова62", 20),
                new Person("Виктория62", "Петрова62", 21),
                new Person("Ангелина62", "Семенова62", 22),
                new Person("Наталья62", "Олегова62", 23),
                new Person("Ксения62", "Арсеньева62", 24),
                new Person("Иван63", "Иванов63", 20),
                new Person("Петр63", "Петров63", 21),
                new Person("Семен63", "Семенов63", 22),
                new Person("Олег63", "Олегов63", 23),
                new Person("Арсений63", "Арсеньев63", 24),
                new Person("Екатерина63", "Иванова63", 20),
                new Person("Виктория63", "Петрова63", 21),
                new Person("Ангелина63", "Семенова63", 22),
                new Person("Наталья63", "Олегова63", 23),
                new Person("Ксения63", "Арсеньева63", 24),
                new Person("Иван64", "Иванов64", 20),
                new Person("Петр64", "Петров64", 21),
                new Person("Семен64", "Семенов64", 22),
                new Person("Олег64", "Олегов64", 23),
                new Person("Арсений64", "Арсеньев64", 24),
                new Person("Екатерина64", "Иванова64", 20),
                new Person("Виктория64", "Петрова64", 21),
                new Person("Ангелина64", "Семенова64", 22),
                new Person("Наталья64", "Олегова64", 23),
                new Person("Ксения64", "Арсеньева64", 24),
                new Person("Иван65", "Иванов65", 20),
                new Person("Петр65", "Петров65", 21),
                new Person("Семен65", "Семенов65", 22),
                new Person("Олег65", "Олегов65", 23),
                new Person("Арсений65", "Арсеньев65", 24),
                new Person("Екатерина65", "Иванова65", 20),
                new Person("Виктория65", "Петрова65", 21),
                new Person("Ангелина65", "Семенова65", 22),
                new Person("Наталья65", "Олегова65", 23),
                new Person("Ксения65", "Арсеньева65", 24)
        };

        speedTestLinkedListOperations(persons);
        speedTestListOperations(persons);
        speedTestSetOperations(persons);
        speedTestMapOperations(persons);
    }
    /////////////////////////////////////////////////////////
    private static void baseMyListMethods(MyLinkedList list){
        long start;
        long stop;
        long result;
        int rand = (int)(Math.random() * 50);
        ArrayList<Integer> timeOp1 = new ArrayList<>();
        ArrayList<Integer> timeOp2 = new ArrayList<>();
        ArrayList<Integer> timeOp3 = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            start = System.nanoTime();
            list.add(new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp1.add((int) result);

            start = System.nanoTime();
            list.add(rand, new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp2.add((int) result);

            start = System.nanoTime();
            list.remove(rand);
            stop = System.nanoTime();
            result = stop - start;
            timeOp3.add((int) result);
        }

        System.out.println(list.getClass().getSimpleName());
        System.out.println("Результаты работы методов:");
        System.out.println("    Операция добавление");
        printInfo(timeOp1);
        System.out.println("    Операция вставка по индексу");
        printInfo(timeOp2);
        System.out.println("    Операция удаление по индексу");
        printInfo(timeOp3);

    }

    private static void baseListMethods(List list){
        long start;
        long stop;
        long result;
        int rand = (int)(Math.random() * 50);
        ArrayList<Integer> timeOp1 = new ArrayList<>();
        ArrayList<Integer> timeOp2 = new ArrayList<>();
        ArrayList<Integer> timeOp3 = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            start = System.nanoTime();
            list.add(new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp1.add((int) result);

            start = System.nanoTime();
            list.add(rand, new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp2.add((int) result);

            start = System.nanoTime();
            list.remove(rand);
            stop = System.nanoTime();
            result = stop - start;
            timeOp3.add((int) result);
        }

        System.out.println(list.getClass().getSimpleName());
        System.out.println("Результаты работы методов:");
        System.out.println("    Операция добавление");
        printInfo(timeOp1);
        System.out.println("    Операция вставка по индексу");
        printInfo(timeOp2);
        System.out.println("    Операция удаление по индексу");
        printInfo(timeOp3);
    }

    private static void baseSetMethods(Set set){
        long start;
        long stop;
        long result;
        ArrayList<Integer> timeOp1 = new ArrayList<>();
        ArrayList<Integer> timeOp3 = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            start = System.nanoTime();
            set.add(new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp1.add((int) result);

            start = System.nanoTime();
            set.remove(new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp3.add((int) result);
        }

        System.out.println(set.getClass().getSimpleName());
        System.out.println("Результаты работы методов:");
        System.out.println("    Операция добавление");
        printInfo(timeOp1);
        System.out.println("    Операция удаление по значению");
        printInfo(timeOp3);

    }

    private static void baseMapMethods(Map map){
        long start;
        long stop;
        long result;
        ArrayList<Integer> timeOp1 = new ArrayList<>();
        ArrayList<Integer> timeOp3 = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            start = System.nanoTime();
            map.put(5, new Person("Ульяна", "Арсеньева", 24));
            stop = System.nanoTime();
            result = stop - start;
            timeOp1.add((int) result);

            start = System.nanoTime();
            map.remove(5);
            stop = System.nanoTime();
            result = stop - start;
            timeOp3.add((int) result);
        }

        System.out.println(map.getClass().getSimpleName());
        System.out.println("Результаты работы методов:");
        System.out.println("    Операция добавления по индексу");
        printInfo(timeOp1);
        System.out.println("    Операция удаления по индексу");
        printInfo(timeOp3);
    }

    private static void printInfo(ArrayList<Integer> timeOp){
        System.out.println("    - максимальное время: " + timeOp.stream().max(Comparator.comparingInt(e -> e)).get());
        System.out.println("    - среднее время: " + timeOp.stream().mapToInt(e -> e).average().getAsDouble());
        System.out.println("    - минимальное время: " + timeOp.stream().min(Comparator.comparingInt(e -> e)).get());
    }
    /////////////////////////////////////////////////////////
    private static void speedTestLinkedListOperations(Person[] persons){
        LinkedList<Person> newList = new LinkedList<>();
        for (Person person : persons) newList.add(person);
        baseListMethods(newList);

        MyLinkedList<Person> newMyList = new MyLinkedList<>();
        for (Person person : persons) newMyList.add(person);
        baseMyListMethods(newMyList);

        System.out.println("/////////////////////////////////////////////////////////");
    }

    private static void speedTestListOperations(Person[] persons) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(persons));
        baseListMethods(arrayList);

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(persons));
        baseListMethods(linkedList);

        System.out.println("/////////////////////////////////////////////////////////");
    }

    private static void speedTestSetOperations(Person[] persons) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(persons));
        baseSetMethods(hashSet);

        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(persons));
        baseSetMethods(linkedHashSet);

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(persons));
        baseSetMethods(treeSet);

        System.out.println("/////////////////////////////////////////////////////////");
    }

    private static void speedTestMapOperations(Person[] persons) {
        HashMap<Integer, Person> hashMap = new HashMap<>();
        for (int i = 0; i < persons.length; i++) hashMap.put(i, persons[i]);
        baseMapMethods(hashMap);

        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < persons.length; i++) linkedHashMap.put(i, persons[i]);
        baseMapMethods(linkedHashMap);

        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        for (int i = 0; i < persons.length; i++) treeMap.put(i, persons[i]);
        baseMapMethods(treeMap);

        System.out.println("/////////////////////////////////////////////////////////");
    }
}

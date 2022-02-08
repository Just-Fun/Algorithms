package ua.com.serzh.sreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(List.of(1, 5), List.of(11, 8), List.of(3, 4));

        Set<Integer> treeSet = lists.stream()
                .map(integers -> integers.stream()
                                .map(integer -> integer + 1)
                                .collect(Collectors.toSet())
/*                        {
                            Set<Integer> set = new HashSet<>();
                            integers.forEach(integer -> set.add(integer + 1));
                            return set;
                        }*/
                )
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);


        int[] arr = new int[]{8, 8, 8, 1, 5, 2, 5, 3, 3};

        List<Integer> integerList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
//                .collect(Collectors.toCollection(TreeSet::new));

        Map<Integer, Long> collect0 = integerList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect0);


        List<Integer> integers = List.of(8, 8, 8, 1, 5, 2, 5, 3, 3);
        Map<Integer, Long> collect = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(collect);
//        {1=1, 2=1, 3=2, 5=2, 8=1}

        List<Integer> integers2 = List.of(8, 8, 8, 1, 5, 2, 5, 3, 3);
        Map<Integer, Long> collect2 = integers2.stream()
//                .sorted()
//                .sorted(Collections.reverseOrder())
//                .sorted(Comparator.comparingInt(Integer::intValue))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .sorted(Collections.reverseOrder())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
//                        TreeMap::new));
                        LinkedHashMap::new));

        System.out.println(collect2);

        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "1.com", 10));
        list.add(new Hosting(2, "2.com", 22));
        list.add(new Hosting(3, "2.com", 3));

        Map<String, Long> result1 = list.stream()
                .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
                .collect(
                        Collectors.toMap(
                                Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);
//        {2.com=22, 1.com=10}

        Map<String, Long> collect1 = list.stream()
                .collect(Collectors.groupingBy(Hosting::getName, Collectors.counting()))
//        {2.com=2, 1.com=1}
                .entrySet()
                .stream()
//                .sorted(Map.Entry.comparingByKey())
//        {1.com=1, 2.com=2}
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//        {2.com=2, 1.com=1}
//                .sorted(Map.Entry.comparingByValue())
//        {1.com=1, 2.com=2}
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//        {2.com=2, 1.com=1}
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        System.out.println(collect1);

        Map<String, Long> collect3 = list.stream()
                .collect(Collectors.groupingBy(Hosting::getName, Collectors.summingLong(Hosting::getWebsites)));
        System.out.println(collect3);
//        {2.com=25, 1.com=10}

    }


    public static void integerStream() {
        Stream<Integer> integerStream = Stream.of(1, 2);
        List<Integer> integers = List.of(5, 6);

        List<Integer> integers1 = Stream.concat(integerStream, integers.stream())
                .collect(Collectors.toList());
        System.out.println(integers1);
    }

    public static void concurrentMap() {
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
//        Map<Integer, Integer> map = new HashMap<>(); // ConcurrentModificationException
        map.put(20, 0);
        map.put(30, 0);

        for (Integer key : map.keySet()) {
            System.out.println(key);
            map.put(40, 0);
        }
//        20
//        30
        map.keySet().forEach(key -> {
            System.out.println(key);
            map.put(40, 0);
        });

//        20
//        40
//        30
    }

    public static class Hosting {

        private int id;
        private String name;
        private long websites;

        public Hosting(int id, String name, long websites) {
            this.id = id;
            this.name = name;
            this.websites = websites;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getWebsites() {
            return websites;
        }

        public void setWebsites(long websites) {
            this.websites = websites;
        }
    }

}

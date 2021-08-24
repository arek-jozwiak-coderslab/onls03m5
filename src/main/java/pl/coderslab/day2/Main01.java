package pl.coderslab.day2;

import java.util.Arrays;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 34, 4, 5, 66);
        //1
        printList(integers, new IntegerFilter());
        //2
        printList(integers, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        });
        //3
        printList(integers, in -> in < 20);
        printList(integers, in -> in * 2 > 100);
        printList(integers, in -> {
            int a = 43;
            return in < a + 30;
        });

        printList(integers, (in) -> {
            return in < 12;

        });


        integers.forEach(in -> System.out.println(in));

        integers.stream()
                .filter(in -> in % 2 == 0)
                .map(in -> in * in)
                .filter(in -> in < 100)
                .forEach(in -> System.out.println(in));

        Filter<String> filter = s -> s.length() > 12;


    }

    static <T, S> void doSth(List<T> l, SomeInterface<T, S> sf) {

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }
}

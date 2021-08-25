package pl.coderslab.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 34, 4, 5, 66);
        integers.stream()
                .filter(in -> in % 2 == 0)
                .map(in -> in + 1)
                .filter(in -> in % 2 == 0)
                .forEach(in -> System.out.println(in));

        int[] ints = {1, 3, 4};
        int sum = Arrays.stream(ints)
                .filter(in -> in > 10)
                .sum();

        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        String collect = fruits.stream()
                .collect(Collectors.joining(":"));

        System.out.println(collect);

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s -> System.out.println(s));

        List<String> p = fruits.stream()
                .filter(s -> s.startsWith("p"))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}

package pl.coderslab.day2.stream;

import java.util.List;

public class MapSample {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 54, 5, 6, 6, 7, 7, 44, 7);

        integers.stream().map(el -> el * el)
                .forEach(System.out::println);

        integers.forEach(System.out::println);
    }
}

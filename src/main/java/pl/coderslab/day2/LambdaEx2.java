package pl.coderslab.day2;

import java.awt.*;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEx2 {
    public static void main(String[] args) {
        List list = List.of(1, "asdas", 1.9, false, new int[]{1, 3});

        Predicate<Object> pred = el -> el instanceof String;

        list.stream()
                .filter(el -> el instanceof String)
                .filter(pred)
                .forEach(s -> System.out.println(s));
    }
}

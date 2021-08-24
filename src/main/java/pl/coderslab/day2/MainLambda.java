package pl.coderslab.day2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLambda {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 34, 4, 5, 66);

        Collections.sort(integers, (integer, t1) -> 0);

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        });
    }
}

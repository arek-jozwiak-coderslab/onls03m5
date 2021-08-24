package pl.coderslab.day2;

import java.util.*;

public class LambdaEx1 {

    public static void main(String[] args) {
        int n = 3;
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
//        Collections.sort(strings);
//        strings.sort((a, b) -> b.compareTo(a));

        strings.sort(Comparator.reverseOrder());

        strings.forEach(s -> System.out.println(s));
    }
}

package StreamsDemo;

import java.util.*;
import java.util.stream.*;

public class StreamDemoCode {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 3, 1, 9, 8, 2, 4);

        // 1) create stream
        Stream<Integer> stream = numbers.stream();

        // 2) filter
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        // 3) map
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        // 4) sorted
        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();

        // 5) distinct
        List<Integer> unique = numbers.stream()
                .distinct()
                .toList();

        // 6) limit
        List<Integer> firstThree = numbers.stream()
                .limit(3)
                .toList();

        // 7) skip
        List<Integer> skipTwo = numbers.stream()
                .skip(2)
                .toList();

        // forEach
        numbers.stream()
                .forEach(System.out::println);

        // reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        // count
        long count = numbers.stream().count();

        // allMatch
        boolean allGreaterThanZero = numbers.stream()
                .allMatch(n -> n > 0);

        // anyMatch
        boolean anyGreaterThanTen = numbers.stream()
                .anyMatch(n -> n > 10);

        // noneMatch
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);
    }
}

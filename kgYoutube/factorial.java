package kgYoutube;

import java.util.stream.IntStream;

public class factorial {

    public static void main(String[] args) {
        int num = 9;

        IntStream.rangeClosed(2, num)
            .reduce((a, b) -> a * b)
            .ifPresent(System.out::println);
    }

}
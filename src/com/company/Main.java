package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(array).filter(x-> x % 2 == 0 ).map(x->x * x).forEach(System.out::println);
        Optional<Integer> a = Arrays.stream(array).filter(x-> x % 2 == 0 ).map(x->x * x).max(Comparator.naturalOrder());
        System.out.println(a);
    }
}

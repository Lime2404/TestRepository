package org.selenide.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder_ArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i, Integer.parseInt(reader.readLine()));
        }
        Collections.reverse(numbers);
        for (Integer s : numbers)
            System.out.println(s);
    }
}

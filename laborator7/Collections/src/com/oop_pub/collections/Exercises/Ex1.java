package com.oop_pub.collections.Exercises;

import java.util.HashSet;

public class Ex1 {

    public static void main(final String[] args) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < 10; i++) {
            int size = set.size();

            set.add(String.valueOf(i % 5));

            if (size == set.size()) {
                System.out.println("EROARE!!! ELEMENT DUPLICAT " + i);
            }
        }
    }
}

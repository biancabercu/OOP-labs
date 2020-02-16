package com.oop_pub.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class MyHashSet extends HashSet<Integer> {
    private int size = 0;

    @Override
    public boolean add(final Integer a) {
        size++;

        return super.add(a);
    }

    @Override
    public boolean addAll(final Collection<? extends Integer> c) {
        size += c.size();

        return super.addAll(c);
    }

    public static void main(final String[] args) {
        MyHashSet h = new MyHashSet();
        ArrayList<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            l.add(i);
        }

        h.add(234);
        System.out.println(h.size);

        h.add(67);
        System.out.println(h.size);

        h.add(3455);
        System.out.println(h.size);

        h.addAll(l);
        System.out.println(h.size);
    }
}

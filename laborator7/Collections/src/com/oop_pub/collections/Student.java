package com.oop_pub.collections;

public class Student {

    protected String name;
    protected float average;

    public Student(final String newName, final float newAverage) {
        this.name = newName;
        this.average = newAverage;
    }

    public String toString() {
        return "[" + name + ", " + average + "]";
    }
}

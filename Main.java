package com.example.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Michaael",15));
        students.add(new Student("Sarah",18));

        //for each loop
        for (Student s: students) {
            System.out.println(s.getName());
        }

    }
}

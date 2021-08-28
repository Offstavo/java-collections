package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        //Arrays collections "the array doesnt have a fixed size"
        ArrayList<String> names = new ArrayList<>();
        //Arraylist doesnt accept primitive datatypes ArrayList<int>
        //Instead there are classes for each primitive datatype ArrayList<Integeer>

//        List<String> students = new ArrayList<>(); for example purposes

        names.add("Michael");
        names.add("Sarah");
//        System.out.println(names.get(0));
//        System.out.println(names.size());
////        names.clear();
//        names.remove("Michael");
//        System.out.println(names.get(0));
//
//        System.out.println(names.contains("Sarah"));
//        System.out.println(names.isEmpty());
//
//        names.remove("Sarah");
//        System.out.println(names.isEmpty());

//        System.out.println(names.indexOf("Michael"));

        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

    }
}

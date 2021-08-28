package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //Maps
        Map<String,String> emailList = new HashMap<>();
        //Like arraylists you cannot have primitive datatypes
        emailList.put("Michael","Michael@gmail.com");
        emailList.put("Brad","Brad@gmail.com");
        System.out.println(emailList.get("Michael"));
        System.out.println(emailList.size());
        emailList.remove("Brad");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Michael"));
        System.out.println(emailList.containsValue("Michael@gmail.com"));
    }
}

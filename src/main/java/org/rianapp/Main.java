package org.rianapp;

import org.rianapp.controllers.Aplikasi;

import java.util.*;
//import java.util.Map;

public class Main {

    public static String Jloping = "http://urlparmaeter.com";
    private String dataObject;

    private Map<String, Integer> maindata(int data) {
        Map<String, Integer> j = new HashMap<>();
        for (int i = 1; i < data; i++) {
            j.put(String.valueOf(i), i);
        }
        return j;
    }

    private String getJloping(String param) {
        return this.Jloping;
    }

    private String setJloping(String param) {
        return this.Jloping = param;
    }
    
    private Map<String, Object> getParatter(Object[] list) {
        Map<String, Object> has = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            has.put("return", "data" + i);
        }
        return has;
    }

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 3;

        Map<String, Object> c = new HashMap<>(); // Creating a Map

        for (int i = 0; i <= a; i++) {
            c.put(String.valueOf(i), i); // Adding values to the Map
        }
        MainData.paramsmainData = "FUCK";
        MainData<String> mainDataInstance = new MainData<>();
        String retrievedData = mainDataInstance.getParamsMainData();
//        System.out.println(retrievedData); // Prints "Test data"
//        System.out.println("Hello world!"+ c);

        MainData.paramsmainData = "1";
        MainData<String> dd = new MainData<>();

        Aplikasi applikasi = new Aplikasi("test");

        System.out.println(applikasi + "aplikasi");

        String datanya = dd.getParamsMainData();
        Main mainData = new Main();
        System.out.println(mainData.getJloping("asda"));
        Main mainclass = new Main();
        Map<String, Integer> mainClass = mainclass.maindata(12);
        Object[] myArray = {"Data 1", "Data 2", "Data 3"};
        Map<String, Object> parmaeterArray = mainclass.getParatter(myArray);
        System.out.println(parmaeterArray.toString() + "parameter array");
        Integer r = 0;
        for (Map.Entry<String, Integer> entry : mainClass.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            r = entry.getValue();
        }
        System.out.println(r);
    }
}

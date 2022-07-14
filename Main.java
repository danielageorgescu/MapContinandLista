package com.itfactory;

import java.util.*;
import java.util.stream.Collector;

import static javax.swing.UIManager.get;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(0) ;
        lista1.add(1) ;
        lista1.add(2) ;
        lista1.add(3) ;
        lista1.add(4) ;
        lista1.add(5) ;
        int x = Collections.max(lista1,null);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);
        lista2.add(11);
        int y = Collections.max(lista2,null);

        List<Integer> lista3 = new ArrayList<>();
        lista3.add(12);
        lista3.add(13);
        lista3.add(14);
        lista3.add(15);
        int z = Collections.max(lista3,null);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,x);
        map.put(2,y);
        map.put(3,z);
        map.put(4,x);
        map.put(5,y);
        map.put(6,z);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
       }
    }


package com.codegym;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi các từ");
         String str = scanner.nextLine();
         String[] list = str.toLowerCase().split(" ");
//        Set<Map.Entry<String,Integer>> setTreeMap = treeMap.entrySet();
        for (int i = 0; i < list.length; i++) {
            if(treeMap.containsKey(list[i])){
                treeMap.put(list[i], treeMap.get(list[i])+1);
            }else {
                treeMap.put(list[i],1);
            }
        }
        System.out.println(treeMap);
    }
}

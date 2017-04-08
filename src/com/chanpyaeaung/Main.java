package com.chanpyaeaung;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String text = "I used to rule the world sea would rise when i give the world now in the morning I slept alone";


        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for(String str : words) {

            Integer n = map.get(str);

            n = (n == null) ? 1 : ++n;
            map.put(str, n);

        }

        for (Map.Entry<String, Integer> key : map.entrySet()) {

            System.out.println(key.getKey()+ " occurred "+key.getValue()+" times");

        }


        for (int i = 1; i < 100; i++) {

            if(i % 10 == 5) {
                System.out.println("FIVE");
            }

        }


    }
}

package com.collections.map;

import java.util.*;

public class InvertMapExample {

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> inverted = invertMap(input);

        System.out.println(inverted);
    }

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // Add key to the list for this value
            result.computeIfAbsent(value, v -> new ArrayList<>())
                  .add(key);
        }

        return result;
    }
}

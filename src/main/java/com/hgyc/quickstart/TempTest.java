package com.hgyc.quickstart;

import java.util.*;
import java.util.stream.Collectors;

public class TempTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        List<String> values = map.values().parallelStream().collect(Collectors.toList());
        System.out.println(values);
    }
}

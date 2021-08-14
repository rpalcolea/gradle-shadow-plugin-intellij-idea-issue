package com.some.example;

import com.some.example.internal.com.google.common.collect.ImmutableMap;

public class MyClassWithGuava {
    private static final ImmutableMap<String, String> CONSTANTS = ImmutableMap.of("a", "b", "c", "d");

    public String useGuava(String key) {
        return CONSTANTS.get(key);
    }
}

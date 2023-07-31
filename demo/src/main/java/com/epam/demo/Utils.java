package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args.size() == 0) {
            return false;
        }
        return args.stream().allMatch(str -> {
            if (str.isEmpty() || str.isBlank()) {
                return false;
            }
            return Double.parseDouble(str) > 0;
        });
    }
}
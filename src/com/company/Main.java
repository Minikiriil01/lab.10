package com.company;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();

        String[] lines = {"a", "b", "c", "d", "e", "f"};
        Conversion<String> listStr = new Conversion(lines);
        listStr.showList();
    }
}


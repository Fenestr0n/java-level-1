package oop.collections;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        ArrayList<String> names = getEmployees();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            result.add(numbers.get(i) + " - " + names.get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}

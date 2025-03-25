package oop.collections;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> employees = getEmployees();
        for (String s : employees) {
            System.out.println(s);
        }
    }

    private static HashSet<String> getEmployees() {
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}

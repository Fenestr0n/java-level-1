package oop.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        MyArrayList employees = getEmployees();
//        employees.add("James");
//        employees.remove("Emma");
//        for (int i = 0; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }

        ArrayList<String> employees2 = getEmployees2();
        employees2.add("James");
        employees2.remove("Olivia");
        employees2.remove(1);
        for (String s : employees2) {
            System.out.println(s);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

//    private static MyArrayList getEmployees() {
//        MyArrayList employees = new MyArrayList();
//        employees.add("John");
//        employees.add("Olivia");
//        employees.add("Emma");
//        employees.add("Max");
//        employees.add("Nick");
//        return employees;
//    }

    private static ArrayList<String> getEmployees2() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}

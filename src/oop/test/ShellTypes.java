package oop.test;

import oop.person.Person;

public class ShellTypes {
    public static void main(String[] args) {
//        Оболочки типов
        int a;
        Integer a1;

        byte b;
        Byte b1;

        short c;
        Short c1;

        long d;
        Long d1;

        char e;
        Character e1;

        float g;
        Float g1;

        double h;
        Double h1;

        boolean i;
        Boolean i1;


        String s = "1000";
        String s1 = "2000";
        System.out.println(s + s1); // 10002000
        int x = Integer.parseInt(s);
        int y = Integer.parseInt(s1);
        System.out.println(x + y); // 3000


        String str = "This is John. He is 27 years old.";
        String name = str.substring(8, 12);
        String ageString = str.substring(20, 22);
        int age = Integer.parseInt(ageString);
        Person person = new Person(name, age);
        System.out.println(person.getName() + " " + person.getAge());
    }
}

package helloworld;

public class Variable {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 5;
        System.out.println(y);

        int john = 100;
        int nick = john * 5;
        int sum = john - nick;
        System.out.println(sum);

        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c); // 3
        int d = a % b;
        System.out.println(d); // 1

        int days = 10_000;
        int years = days / 365;
        int months = (days - (years * 365)) / 30;
        int leftDays = days - (years * 365) - (months * 30);
        System.out.println(years);
        System.out.println(months);
        System.out.println(leftDays);

    }
}

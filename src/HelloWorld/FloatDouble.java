package HelloWorld;

public class FloatDouble {
    public static void main(String[] args) {
        double radius = 10.8;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area); // 366.2496000000001

        float radius2 = 10.8f;
        float pi2 = 3.14f;
        float area2 = pi2 * radius2 * radius2;
        System.out.println(area2); // 366.24963

        int helen = 47;
        int max = 17;
        int john = 13;
        int nick = 22;
        int sum = helen + max + john + nick;
        double average = (double) sum / 4;
        System.out.println(average);
    }
}

package helloworld;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
             if (i % 2 == 0) System.out.println(i);
             if (i == 8) break;
            i++;
        }

        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        for (int k = 10; k >= 0; k--) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
        }
    }
}

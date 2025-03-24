package HelloWorld;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Helen",
                "Max",
                "John",
                "Alex",
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

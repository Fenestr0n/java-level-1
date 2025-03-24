package OOP;

public class Monster {
    int eyes;
    int legs;
    int arms;

    public Monster(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    public Monster(int count) {
        this(count, count, count);

    }

    public Monster() {
        this(2);
    }

    void voice() {
        voice(1);
    }

    void voice(int count) {
        voice(count, "Grrrrrrrrrrr...");
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}

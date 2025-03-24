package OOP;

public class MainMonster {
    public static void main(String[] args) {
        Monster monster = new Monster(5);
        monster.voice();
        monster.voice(3, "Muuuuu");
    }
}

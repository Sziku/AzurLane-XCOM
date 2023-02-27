package battleshipgame.ships;

public abstract class Ship {
    String name;
    String fraction;
    String rarity;
    int health;
    int armor;
    int mana;
    int power;
    int moveStep;
    int level;

    public Ship(String name, String fraction, String rearity,int health, int armor, int mana, int power, int moveStep, int level) {
        this.name = name;
        this.fraction=fraction;
        this.rarity =rearity;
        this.health = health;
        this.armor = armor;
        this.mana = mana;
        this.power = power;
        this.moveStep=moveStep;
        this.level=level;
    }

    public abstract void attack();
    public abstract void superAttack();
    public abstract void def();
    public abstract void move();
}

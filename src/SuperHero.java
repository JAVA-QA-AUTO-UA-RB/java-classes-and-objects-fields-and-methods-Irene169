public class SuperHero {

    // Тут мають бути властивості і поведінка Супергероя
    String name;
    int attackPower;
    int defencePower;
    int health = 100;


    public void attack(SuperHero opponent) {
        int damage = attackPower - opponent.defencePower;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println(name + " атакує " + opponent.name + " і завдає " + damage + " ушкоджень.");
        opponent.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " має залишок здоров'я: " + health + " ");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStats() {
        System.out.println(name + " - Атака: " + attackPower + ", Захист: " + defencePower + ", Здоров'я: " + health);
    }

    public String getName() {
        return name;
    }
}


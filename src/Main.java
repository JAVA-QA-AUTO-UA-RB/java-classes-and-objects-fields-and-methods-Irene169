public class Main {
    public static void main(String[] args) {

        // Тут має розгортатися епічна битва між Супергероями
SuperHero flash = new SuperHero();
flash.name = "Флеш";
flash.attackPower = 25;
flash.defencePower = 5;

SuperHero ironMan = new SuperHero();
ironMan.name = "Залізна Людина";
ironMan.attackPower = 15;
ironMan.defencePower = 10;

int round = 1;

while (flash.isAlive() && ironMan.isAlive()) {
    System.out.println("\n Раунд " + round + ":");

    flash.attack(ironMan);

    System.out.println();

    if (ironMan.isAlive()) {
        ironMan.attack(flash);
    }

    round++;

}

System.out.println("\n Битва завершена!");
if (flash.isAlive()) {
    System.out.println("Переможець: " + flash.getName()+ "!");
} else if (ironMan.isAlive()) {
    System.out.println("Переможець: " + ironMan.getName() + "!");
} else {
    System.out.println("Нічия!");
}
    }
}

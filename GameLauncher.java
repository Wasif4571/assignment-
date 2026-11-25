 public class GameLauncher {
    public static void main(String[] args) {
    Weapon flameSword = new Weapon("Flame Sword", 35, "Fire");
    Weapon woodenBow = new Weapon("Wooden Bow", 12);
    
    Hero customHero = new Hero("Alex", 20, 250, "Warrior", 500, flameSword);
    Hero starterHero = new Hero("Finn", "Archer"); 
    Hero clonedHero = new Hero(customHero);
    
    customHero.printCharacterSheet(); 
    System.out.println();
    starterHero.printCharacterSheet();
    System.out.printCharacterSheet();
    clonedHero.printCharacterSheet();
    